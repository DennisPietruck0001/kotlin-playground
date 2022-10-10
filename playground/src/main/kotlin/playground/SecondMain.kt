package playground

fun replace(firstString: String, chosenLetter: Char, newLetter: Char): String {
    var result: CharArray =firstString.toCharArray()
    for(i in 0..firstString.length-1){
        if(firstString[i] == chosenLetter) {
            result[i] = newLetter
        }
    }
    return String(result)
}

open class developer() {
    val practice: String = "Backend"

    fun teach() {
        println("sends Sorour videos about Kotlin")
    }
}

class Mouse(name: String, v: Double = 1.0): developer() {
    var name: String = name
    var v: Double = v

    fun printMe() {
        println("Name: " + name)
        println("Speed: " + v + "m/s")
    }
    fun wheel(duration: Int): Double {
        return v * duration
    }
}

fun main(args: Array<String>) {
    println(replace("Hello World", 'o', 'ö'))
    println("-------------------------")
    val dennis: Mouse = Mouse(name = "Dennis", v = 0.5)
    //dennis.name = "Dennis"
    //dennis.v = 0.5
    dennis.printMe()
    println(dennis.wheel(60))
    dennis.teach()
    println(dennis.practice)

}