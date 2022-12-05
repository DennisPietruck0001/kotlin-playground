package orderTables

import java.util.*

fun addingTwoNum(x: Int, y: Int): Int {
    println(x)
    println(y)
    return x + y
}

fun addingOneToEachNum(x: Int): Int {
    return x + 1
}

fun filterNum(x: Int): Boolean {
    if(x > 5) {
        return true
    }
    return false
}

fun removeHFromWordsStartingWithH(s: String): String {
    return s.replace("H".toRegex(), "")
}
fun main() {
    val myListInt = listOf(1, 11, 2, 35, 10)
    val newListInt = myListInt.map { x -> x + 1 }
    val newValueInt = newListInt.reduce { x, y -> x + y }
    println(newValueInt)
    val filteredListInt= newListInt.filter { it > 5 }.sorted()
    println(filteredListInt)

    println("----------------------------")

    val myListString = mutableListOf("Hello", "Salami", "Computer", "Hi", "Frankreich")
    val newListNoHWords = myListString.map(::removeHFromWordsStartingWithH)
    val newListNoHWordsLambda = myListString.map { s -> s.replace("H".toRegex(), "") }
    println(newListNoHWords)
    println(newListNoHWordsLambda)
    val noHWords = myListString.filterNot { it.contains("H") }
    println(noHWords)

    println("----------------------------")

    val myListOfNames = listOf("SOROUR", "LISA", "ARAM", "DENNIS", "NICOLE", "ERSIN", "ANDREAS")
    val newListOfNames = myListOfNames.map { it.lowercase() }.filterNot { it.contains("s") }
    println(newListOfNames)

    println("----------------------------")
    
    val myListOfChar = listOf("h", "a", "l", "l", "o")
    val myWord = myListOfChar.reduce { acc, string -> acc + string }
    println(myWord)

    println("----------------------------")

    val randomInt: List<Int> = listOf(11, 258, 72, 50, 75, 1026, 8, 3)
    val evenNum = randomInt.filter { it % 2 == 0 }.map { it / 2 }
    println(evenNum)
    val oddNum = randomInt.filter { it % 2 != 0 }.map { it * 2 }
    println(oddNum)
}