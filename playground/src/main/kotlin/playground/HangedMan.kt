package playground

// schreibe eine function "hanged man", die ein String und Char als Parameter bekommt
// die function gibt ein String zurück
// der neue String hat an jeder Stelle, an der Char vorkommt, ein x und allen anderen ein -
// Beispiel: "Hello World" als Char: l und return --xx-----x-

fun hangedMan(s: String, c: Char): String {
    var result: String = ""
    for(i in s) {
        if(i == c) {
            result = result + c 
        } else {
            result = result + '-'
        }
    }
    return result
}

fun main() {
    val myString: String = "Hello"
    var newString: String = myString + '-'
    println(newString)
    newString = newString + 'x'
    println(newString)

    val result1 = hangedMan("hello World", 'e')
    println(result1)
}