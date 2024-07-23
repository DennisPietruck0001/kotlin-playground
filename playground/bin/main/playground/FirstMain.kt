package playground

// Cäsar Verschlüsselung

/*fun main() {
    val myString: String = "meine ziege\n"
    for(a in myString) {
        var encrypted = a + 3
        if(encrypted !in 'A'..'Z' && a in 'A'..'Z') {
            encrypted = encrypted - 91 + 65
        }
        if(encrypted !in 'a'..'z' && a in 'a'..'z') {
            encrypted = encrypted - 123 + 97
        }
        if(a != ' ') {
            print(encrypted)
        } else {
            print(a)
        }
    }
}*/



// eine Funktion Modulo von bis

fun myModulo(series: Int, from: Int, until: Int) {
    for(i in from..until) {
        val multiplesOf: Boolean = i % series == 0
        if(multiplesOf) {
            println(i)
        }
    }
}

fun add(a: Int, b: Int): Int {
    val result: Int = a + b
    return result
}

// Rekursion mit Fibonacci und Fakultät

fun fibonacci(n: Int): Int {
    if(n == 1) {
        return 1
    }
    if(n == 0) {
        return 0
    }
    val before: Int = fibonacci(n - 1)
    val preBefor: Int = fibonacci(n - 2)
    return before + preBefor
}
// Fakultät 1.Teil als Funktion mit return
fun factorial(n: Int): Int {
  var result: Int = 1
    for(i in 2..n) {
        result *= i
    }
    return result
}
// Fakultät 2.Teil als Funktion mit Rekursion
fun factorialRecursive(m: Int): Int {
    if(m == 0) {
        return 1
    } else {
        return m * factorialRecursive(m - 1)
    }
}

// einzeilige Funktionen
fun square(a: Int): Int {
    return a * a
}
// oder die Funktion in nur einer Zeile schreiben:
fun squareInOneLine(b: Int) = b * b

// Übung Abs
fun absoluteValue(a: Int) = if(a < 0) -1 * a else a

// Übung Summe von Array
fun sumOfArray(a: Array<Int>): Int {
    var sum: Int = 0
    for(number in a) {
        sum += number
    }
    return sum
}

fun main() {
    myModulo(11, 0, 200)
    println("-------------------------")
    val x: Int = add(5, 6)
    val y: Int = add(x, 4)
    println(y)
    println("-------------------------")
    println(fibonacci(30))
    println("-------------------------")
    val firstFactorial: Int = factorial(4)
    println(firstFactorial)
    println("-------------------------")
    val recursiveFactorial: Int = factorialRecursive(5)
    println(recursiveFactorial)
    println("-------------------------")
    val squareCalculation: Int = square(5)
    println(squareCalculation)
    println("-------------------------")
    val oneLineSquare: Int = squareInOneLine(4)
    println(oneLineSquare)
    println("-------------------------")
    println(absoluteValue(-5))
    println(absoluteValue(42))
    println("-------------------------")
    val myArray = arrayOf(24, 30, 7)
    println(sumOfArray(myArray))
}