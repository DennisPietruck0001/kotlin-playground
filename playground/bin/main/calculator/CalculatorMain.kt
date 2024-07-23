package calculator

import playground.factorial
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sin

fun addition(a: Int, b: Int): Int {
    return a + b
}

fun deduction(a: Int, b: Int): Int {
    return a - b
}

fun multiplication(a: Int, b: Int): Int {
    return a * b
}

fun division(a: Double, b: Double): Double {
    return round(a * 10000 / b) / 10000
}

fun faculty(a: Int): Int {
    return factorial(a)
}

fun sinus(a: Double): Double {
    return sin(a)
}

fun cosinus(a: Double): Double {
    return cos(a)
}

fun power(a: Int, b: Int): Double {
    return a.toDouble().pow(b.toDouble())
}