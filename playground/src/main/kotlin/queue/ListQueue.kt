package queue

import train.Locomotive
import train.Train

interface Queue<T> {
    fun enqueue(element: T)
    fun dequeue(): T?
    fun peek(): T?
}
class ListQueue<T>: Queue<T> {

    private val queue: MutableList<T> = mutableListOf<T>()
    override fun enqueue(element: T) {
        queue.add(element)
    }
    override fun dequeue(): T? {
        if(queue.isNotEmpty()) {
            return queue.removeAt(0)
        } else {
            return null
        }
    }
    override fun peek(): T? {
        if(queue.isNotEmpty()) {
            return queue[0]
        } else {
            return null
        }
    }

    override fun toString(): String {
        var result: String = "|Your Turn|"
        for(element in queue) {
            result += "-|$element|"
        }
        return result
    }
}

fun <T>ListQueue<T>.addAndRemove(element: T): T? {
    enqueue(element)
    return dequeue()
}
fun addFooAndBar(queue: Queue<String>) {
    queue.enqueue("Foo")
    queue.enqueue("Bar")
}
fun main() {
    val queue: Queue<String> = ListQueue<String>()
    addFooAndBar(queue)

    var element = queue.dequeue()
    println(element) // Foo

    queue.enqueue("Baz")
    println(queue)

    element = queue.dequeue()
    println(element) // Bar

    element = queue.dequeue()
    println(element) // Baz

    println(queue)
    println("-------------------")

    val myIntQueue = ListQueue<Int>()
    myIntQueue.enqueue(1)
    myIntQueue.enqueue(2)
    val myVal = myIntQueue.addAndRemove(3)
    println(myVal) // 1
    println(myIntQueue) // 2, 3
    val peek = myIntQueue.peek()
    println(peek)

    val trainQueue: Queue<String> = Train(Locomotive())
    addFooAndBar(trainQueue)
    println(trainQueue)
}