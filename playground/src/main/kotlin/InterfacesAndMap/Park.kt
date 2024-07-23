package InterfacesAndMap

import java.lang.Exception
import java.lang.IllegalStateException
import kotlin.random.Random

fun main() {
    val attendance = hashMapOf<String, Int>(Pair("23 Sept", 2837), Pair("24 Sept", 3726), Pair("25 Sept", 6253))
    attendance["26 Sept"] = 1234
    val peopleAttended = attendance["25 Sept"]?.plus(attendance["26 Sept"]!!)
    println("How many people attended in total on 25 & 26 Sept? $peopleAttended")
    println("Is data for 22 Sept available? ${attendance.containsKey("22 Sept")}")

    println("Input something!")
    val userInput = readLine()
    println("You wrote: $userInput")

    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30))
    println(Random.nextDouble(300.0))

    println("What is your birth year?")
    val userBirthyear = readLine()?:""
    val currentYear = 2022
    println("You are ${currentYear - userBirthyear.toInt()}")

    println("Input an integer!")
    val userInt = readLine()?:""
    val myDouble: Float = 3.14F
    val result = userInt.toInt() * myDouble
    println("Your result is $result")
    println(result::class.java)

    println("Inter a String or an Int")
    val test = readLine()
    //throw IllegalStateException("I do not like this input")
    try {
        println(test?.toInt())
    } catch (e: Exception) {
        e.printStackTrace() //if you use this in a server only the developer get the error message
        println("An exception happened \n ${e.localizedMessage}")
    } finally {
        println("The execution has completed")
    }
}