package com.emergetools.test.runner

import android.os.StrictMode
import android.util.Log
import androidx.test.platform.app.InstrumentationRegistry
import io.ktor.network.selector.ActorSelectorManager
import io.ktor.network.sockets.InetSocketAddress
import io.ktor.network.sockets.Socket
import io.ktor.network.sockets.aSocket
import io.ktor.network.sockets.openReadChannel
import io.ktor.network.sockets.openWriteChannel
import io.ktor.utils.io.ByteReadChannel
import io.ktor.utils.io.ByteWriteChannel
import io.ktor.utils.io.readUTF8Line
import io.ktor.utils.io.writeStringUtf8
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import org.json.JSONObject

/**
 * A client for the test orchestration server.
 */
class EmergeTestClient private constructor(
  private val enabled: Boolean,
  private val port: Int,
  private val traceEnabled: Boolean,
) {

  companion object {
    private const val TAG = "EmergeTestClient"

    private const val ARGUMENT_SERVER_PORT = "serverPort"
    private const val ARGUMENT_TRACE = "trace"

    private const val SERVER_PORT_DISABLED = -1

    val INSTANCE by lazy {
      val arguments = InstrumentationRegistry.getArguments()
      val serverPort = arguments.getString(
        ARGUMENT_SERVER_PORT,
        SERVER_PORT_DISABLED.toString()
      ).toInt()
      val serverEnabled = serverPort != SERVER_PORT_DISABLED
      val traceEnabled = arguments.getString(ARGUMENT_TRACE, "false").toBoolean()
      EmergeTestClient(serverEnabled, serverPort, traceEnabled).apply {
        start()
      }
    }
  }

  private var socket: Socket? = null
  private var input: ByteReadChannel? = null
  private var output: ByteWriteChannel? = null
  private val sendMutex by lazy { Mutex() }

  fun start() {
    if (enabled) {
      // To be able to make network calls from the main thread.
      StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder().permitAll().build())

      socket =
        runBlocking {
          aSocket(ActorSelectorManager(Dispatchers.IO)).tcp()
            .connect(InetSocketAddress("127.0.0.1", port))
        }

      input = socket!!.openReadChannel()
      output = socket!!.openWriteChannel(autoFlush = true)
    }
  }

  fun stop() {
    socket?.close()
    socket = null
    input = null
    output = null
  }

  fun loop(block: (instruction: JSONObject) -> Boolean) {
    Log.v(TAG, "Starting loop")
    do {
      val message = runBlocking {
        input!!.readUTF8Line()
      }
      if (message == null) {
        Log.v(TAG, "Received null, breaking out of loop")
        break
      }
      Log.v(TAG, "Received: $message")
      val result = block(JSONObject(message))
    } while (result)
  }

  fun <T> trace(
    name: String,
    block: () -> T,
  ): T {
    if (!enabled || !traceEnabled) {
      return block()
    }

    val operation = JSONObject().apply {
      put("type", "trace")
      put("event", "call")
      put("method_id", name)
    }
    send(operation)
    val result = block()
    operation.put("event", "return")
    send(operation)
    return result
  }

  fun sendErrorAsync(error: String) {
    sendAsync(
      JSONObject().apply {
        put("type", "error")
        put("error", error)
      }
    )
  }

  fun sendAsync(json: JSONObject) = runBlocking {
    launch(Dispatchers.IO) {
      send(json)
    }
  }

  fun send(json: JSONObject) = runBlocking {
    // Concurrent writing is not supported
    sendMutex.withLock {
      val string = json.toString()
      Log.v(TAG, "sending: $string")
      output!!.writeStringUtf8("$string\n")
    }
  }
}
