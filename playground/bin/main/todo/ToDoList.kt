package todo

import java.util.UUID

class ToDoList() {
    val toDos: MutableList<ToDo> = mutableListOf()
    fun addToDo(toDo: String): String {
        val id = UUID.randomUUID().toString()
        toDos.add(ToDo(toDo, id))
        return id
    }
    fun setDoneOneToDo(id: String) {
        for(toDo in toDos) {
            if(toDo.id == id) {
                toDo.setDone()
            }
        }
    }
    fun deleteToDo(id: String) {
        for(toDo in toDos) {
            if(toDo.id == id) {
                toDos.remove(toDo)
            }
        }
    }
    override fun toString(): String {
        var result: String = "ToDo list:\n"
        for(toDo in toDos) {
            result = result + toDo + "\n"
        }
        return result
    }
}
