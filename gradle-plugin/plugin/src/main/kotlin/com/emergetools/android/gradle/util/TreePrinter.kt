package com.emergetools.android.gradle.util

sealed class Node(val content: String) {
  class Heading(content: String) : Node(content) {
    val children = mutableListOf<Node>()
  }
  class Item(content: String) : Node(content)
}

class TreePrinter(private val rootHeading: String) {
  private val root = Node.Heading(rootHeading)

  fun addHeading(content: String, parent: Node.Heading = root): Node.Heading {
    val node = Node.Heading(content)
    parent.children.add(node)
    return node
  }

  fun addItem(content: String, parent: Node.Heading = root) {
    val node = Node.Item(content)
    parent.children.add(node)
  }

  fun print(): String {
    return formatNode(root)
  }

  private fun formatNode(node: Node, isLast: Boolean = false): String {
    return when (node) {
      is Node.Heading -> formatHeading(node)
      is Node.Item -> formatItem(node, isLast)
    }
  }

  private fun formatHeading(node: Node.Heading): String {
    val width = node.content.length + 2
    return buildString {
      append("╔${"═".repeat(width)}╗\n")
      append("║ ${node.content} ║\n")
      if (node.children.isNotEmpty()) {
        append("╠${"═".repeat(width)}╝\n")
      } else {
        append("╚${"═".repeat(width)}╝\n")
      }

      node.children.forEachIndexed { index, child ->
        append(formatNode(child, index == node.children.size - 1))
        if (index < node.children.size - 1) append("\n")
      }
    }
  }

  private fun formatItem(node: Node.Item, isLast: Boolean): String {
    val prefix = if (isLast) "╚═ " else "╠═ "
    return "$prefix${node.content}"
  }
}

