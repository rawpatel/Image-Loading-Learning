package com.surendra.image_loading_learning.LRUCache

private class Node(
    val key :Int,
    var value: Int,
    var next : Node? = null,
    var prev : Node? = null
)

class LRUCache(private val capacity: Int){

    private val head = Node(0, 0)
    private val tail = Node(0,0)
    private val hashMap = HashMap<Int, Node>()

    init {
        head.next = tail
        tail.prev = head
    }

    fun get(key: Int): Int{
        if(key !in hashMap) return -1
        val nodeToBeRemoved = hashMap.getValue(key)
        removeNode(nodeToBeRemoved)
        insertAtEnd(nodeToBeRemoved)
        return nodeToBeRemoved.value
    }


    private fun removeNode(nodeToBeRemoved: Node) {

    }

    private fun insertAtEnd(node: Node){

    }
}