package listfunctions

class Stack {
    private val values = mutableListOf<String>()
    fun push(element: String) {
        values.add(0, element)
    }

    fun pop(): String {
        return values.removeAt(0)
    }

    fun peek(): String {
        return values[0]
    }
}

fun main() {
   /* val list = mutableListOf<String>()
    println(list)
    list.add(0, "MyString")
    list.add(0, "MyString2")
    println(list)
    val removed = list.removeAt(0)
    println(removed)
    println(list) */



    val stack = Stack()
    val stack2 = Stack()
    stack.push("Foo")
    stack.push("Bar")
    stack.push("Baz")
    println(stack.peek())
    stack2.push("Sorour")
    stack2.push("Dennis")
   // stack.values.clear()  //geht nicht weil in class ist private val values
    val myElement = stack.pop()
    println(myElement) // Baz
}