package playground

// schreibe eine Funktion, die ein String als Parameter bekommt und ein Boolean zurück gibt
// die Funktion gibt True zurück, wenn String ein Palindrom ist. Sonst False
// Tipp: String.reversed


fun palindrom(name: String): Boolean {
   // val isPlindrom: Boolean = true
   // val notPalindrom: Boolean = false
    val lowerAndNoSpace = name.lowercase().replace(" ", "")
    val reversedName = lowerAndNoSpace.reversed()
    /*if(reversedName == lowerAndNoSpace) {
        return true
    } else {
        return false
    }*/
    return lowerAndNoSpace == reversedName
}

fun main() {
    val isPalindrom: Boolean
    isPalindrom = palindrom("Hanne sah Hasen nah")
    println(isPalindrom)


   /* val string2: String = "Hello World"
    val newString2 = string2.replace(" ", "")
    println(newString2) */

    /* val someNewString: String = "ANA"
    val lower = someNewString.lowercase()
    println(lower)*/


  /*  val someString: String = "peter"
    val newString = someString.reversed()
    println(someString)
    println(newString) */
}