package lambdas

import java.io.File
import java.util.*


// eine Funktion, die eine Liste aus Strings bekommt und eine neue Liste zurückgibt, in der alle Strings kleingeschrieben sind.
fun lowercaseStrings(alphabetList: List<String>): List<String> {
    return alphabetList.map { it.lowercase() }
}

// eine Funktion, die eine Liste aus Strings bekommt und alle Sonderzeichen aus  den Strings entfernt
fun removeNonAlphabetCharacter(s: String) = s.replace("[^A-Za-z ]".toRegex(), "")
fun noSpecialCharacterStrings(listOfStrings: List<String>): List<String> {
    return listOfStrings.map { removeNonAlphabetCharacter(it) }
}

// eine Funktion, die eine Liste aus Strings bekommt und eine neue Liste zurückgibt in der alle leeren Strings entfernt sind.
fun deleteEmptyStrings(listOfStrings: List<String>): List<String> {
    return listOfStrings.filter { it.isNotEmpty() }
}

// eine Funktion, die eine Liste aus String bekommt und eine Liste aus Strings zurückgibt, die nur noch einzelne Wörter beinhalten
fun makeWord(listOfAlphabets: List<String>): List<String> {
    return listOfAlphabets.flatMap { it.split(" ") }
}

// eine Funktion, die eine Liste aus Strings bekommt und eine Map zurückgibt. Dabei ist der Key ein Wort aus der Liste und der Value die Häufigkeit
fun frequency(myListOfStrings: List<String>): Map<String, Int> {
    return myListOfStrings.groupBy { it }.mapValues { it.value.size }
}

fun main() {
    val myListOfBigAlphabets = listOf("H", "S", "D", "E", "J", "K", "L")
    println(myListOfBigAlphabets)
    println(lowercaseStrings(myListOfBigAlphabets))

    println("---------------------------------")

    val myListOfAlphabetsWithspecialCharacters = listOf("Sorour25", "*", "Dennis", "!", "Aram", "Andi")
    println(myListOfAlphabetsWithspecialCharacters)
    val myListofAlphabetsWithEmptyStrings = noSpecialCharacterStrings(myListOfAlphabetsWithspecialCharacters)
    println(myListofAlphabetsWithEmptyStrings)

    println("---------------------------------")

    println(deleteEmptyStrings(myListofAlphabetsWithEmptyStrings))

    println("---------------------------------")

    val myListOfAlphabets = listOf("Hello World", "How are you ?")
    println(myListOfAlphabets)
    println(makeWord(myListOfAlphabets))

    println("---------------------------------")

    val myListOfStrings = listOf("Sorour", "Dennis", "Sorour", "Nicole", "Damian", "Sorour", "Damian")
    println(myListOfStrings)
    println(frequency(myListOfStrings))

    println("---------------------------------")

    val lines = File("playground/src/main/kotlin/lambdas/bible.txt").readLines()//.take(20)  // lese alle Zeilen in der Datei
    val allWordsInSmall = lowercaseStrings(lines)
    val wordsOnly = noSpecialCharacterStrings(allWordsInSmall)
    val wordsWithNoemptyStrings = deleteEmptyStrings(wordsOnly)
    val wordElemetStrings = makeWord(wordsWithNoemptyStrings)
    val wordsFrequency = frequency(wordElemetStrings)
    println(wordsFrequency)
}