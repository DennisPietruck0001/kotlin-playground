package lambdas

import java.io.File

fun printFirst10Lines(list: List<String>) {
    list
        .take(10) // nimm die ersten 10 elemente
        .forEach { line -> println(line) } // for jedes element (jede Zeile) in der Liste, führe println aus.
}

fun main() {
    val lines = File("playground/src/main/kotlin/lambdas/bible.txt").readLines() // lese alle Zeilen in der Datei
    printFirst10Lines(lines)
}