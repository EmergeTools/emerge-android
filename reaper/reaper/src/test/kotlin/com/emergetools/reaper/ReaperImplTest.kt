package com.emergetools.reaper

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.File

private class FakeDelegate : ReaperImpl.Delegate {
  private val pendingReports = mutableSetOf<String>()
  private val currentReports = mutableSetOf<String>()
  val idToFile = mutableMapOf<String, File>()

  override fun startReport(id: String): File? {
    currentReports.add(id)
    val file = File.createTempFile("FakeDelegate", null)
    idToFile[id] = file
    return file
  }

  override fun deleteReport(id: String) {
    currentReports.remove(id)
    pendingReports.remove(id)
  }

  override fun markReportPending(id: String) {
    currentReports.remove(id)
    pendingReports.add(id)
  }

  override fun listCurrentReports(): Collection<String> {
    return currentReports.toMutableList()
  }

  override fun listPendingReports(): Collection<String> {
    return pendingReports.toMutableList()
  }

  override fun requestUpload(apiKey: String, baseUrl: String, isDebug: Boolean) {
    // Empty
  }

  override fun sendError(message: String) {
    // Empty
  }

  override fun d(message: String) {
    // Empty
  }

  override fun e(message: String) {
    // Empty
  }

  override fun <T> trace(name: String, block: () -> T): T {
    return block()
  }
}

class ReaperImplTest {
  private lateinit var tracker: HashTracker
  private lateinit var delegate: FakeDelegate

  @BeforeEach
  fun init() {
    tracker = SynchronizedSetHashTracker()
    delegate = FakeDelegate()
  }

  @Test
  fun `clears pending reports if there are too many`() {
    for (i in 1..11) {
      delegate.startReport("$i")
      delegate.markReportPending("$i")
    }
    val impl = ReaperImpl(tracker = tracker, delegate = delegate, apiKey = "<apikey>")
    impl.sweepReports()
    assertThat(delegate.listPendingReports()).isEmpty()
  }

  @Test
  fun `uploads reports containing hashes`() {
    val impl = ReaperImpl(tracker = tracker, delegate = delegate, apiKey = "<apikey>")

    impl.startReport()
    tracker.logMethodEntry(-1L)
    impl.finalizeReport()

    assertThat(delegate.listPendingReports()).hasSize(1)
    val file = delegate.idToFile[delegate.listPendingReports().single()]!!
    assertThat(file.readBytes().toList()).containsExactlyElementsIn(
      byteArrayOf(
        -1,
        -1,
        -1,
        -1,
        -1,
        -1,
        -1,
        -1
      ).toList()
    ).inOrder()
  }

  @Test
  fun `reports hashes prior to construction in the first report`() {
    tracker.logMethodEntry(0x0102030405060708)
    val impl = ReaperImpl(tracker = tracker, delegate = delegate, apiKey = "<apikey>")
    impl.startReport()
    impl.finalizeReport()

    assertThat(delegate.listPendingReports()).hasSize(1)
    val file = delegate.idToFile[delegate.listPendingReports().single()]!!
    assertThat(file.readBytes().toList()).containsExactlyElementsIn(
      byteArrayOf(
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8
      ).toList()
    ).inOrder()
  }

  @Test
  fun `sweeping finalizes pre-existing reports`() {
    delegate.startReport("previous1")
    delegate.startReport("previous2")
    val impl = ReaperImpl(tracker = tracker, delegate = delegate, apiKey = "<apikey>")
    impl.sweepReports()

    assertThat(delegate.listPendingReports()).containsExactly("previous1", "previous2")
  }
}
