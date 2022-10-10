package playground

open class Computer(speed: Double, ram: Int, graphics: String) {
    val speed: Double = speed
    val ram: Int = ram
    val graphics: String = graphics

    fun print() {
        println("Speed: $speed")
        println("Ram: $ram")
        println("Graphic Card: $graphics")
    }
}

class Laptop(speed: Double, ram: Int, graphics: String, screen: Double): Computer(speed, ram, graphics) {
    val screen: Double = screen
}

class Desktop(speed: Double, ram: Int, graphics: String, lights: Boolean): Computer(speed, ram, graphics) {
    val lights: Boolean = lights
}

fun main(args: Array<String>) {
    var desktop: Desktop = Desktop(4.2, 32, "GTX 1080", true)
    var laptop: Laptop = Laptop(2.1, 8, "Intel HD 3000", 15.6)
    desktop.print()
    println("---------------------")
    laptop.print()
}