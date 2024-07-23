package InterfacesAndMap

interface Oven {
    val tempreture: Int

    fun turnOn()
    fun turnOff()
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

class Bosch: Oven {
    override val tempreture: Int = 180

    override fun turnOn() {
         println("Turning on")
    }

    override fun turnOff() {
        println("Turning off")
    }
}

fun getOven(): Oven {
    return Bosch()
}
fun main() {
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.cook(150)
    myOven.turnOff()
}