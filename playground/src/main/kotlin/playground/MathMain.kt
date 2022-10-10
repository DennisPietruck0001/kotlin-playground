package playground
import kotlin.math.*

// eine Klasse, die einen Kreis darstellt und eine Funktion für Flächenberechnung hat.
class Circle (r: Double) {
    public var radius: Double = r
        //get() = field
        set(value) {
            if(value > 0.0) {
                field = value
            }
        }

    init {
        println("Dear Circle")
        println(radius)
        println(validRadius) //sollte nicht funktionieren, weil validRadius noch nicht inistialisiert ist???
        println(area())
        println("------------------")
    }

    public val validRadius: Boolean
        get() = radius > 0.0

    fun area(): Double = radius * radius * PI
}

fun main(args: Array<String>) {
    println(PI)
    val c: Circle = Circle(4.2)
    val c2: Circle = Circle(5.6)
    c.radius = -5.5
    println(c.radius)
    println(c.area())
}