package todo


class ToDo(val description: String, val id: String) {
    var done: Boolean = false
    fun setDone() {
        done = true
    }

    override fun toString(): String {
        return "ToDo: $description ---> done: $done with ID: $id"
    }
}

fun main() {
    /*val myToDo: ToDo = ToDo("Katze füttern", 1)
    myToDo.setDone()
    println(myToDo)
    println("----------------------------------------")*/

    val myToDoList: ToDoList = ToDoList()
    val id1 =  myToDoList.addToDo("Müll rausbringen")
    val id2 = myToDoList.addToDo("Einkaufen")
    myToDoList.addToDo("Aufräumen")
    myToDoList.setDoneOneToDo(id1)
    myToDoList.deleteToDo(id2)
    println(myToDoList)
    println(id1)

  /*  println("----------------------------------------")
    println("Hello\nWorld")
    val myString1 = "Hello"
    val myString2 = myString1 + "\n" + "World"
    println(myString2) */
}