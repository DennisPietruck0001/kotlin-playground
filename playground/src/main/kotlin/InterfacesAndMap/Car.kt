package InterfacesAndMap

interface Transport {
    var price: Int
    fun drive()
}

class Car : Transport {
    override var price: Int = 200
    override fun drive() {
        println("This car will drive you to your destination with only $price EUR.")
    }
}

class Limousine: Transport {
    override var price: Int = 1000
    override fun drive() {
         println("This limousine will drive you to your destination in comfort with $price EUR.")
    }
}

class CarStore {
    fun getTransported(): Transport {
        return Car()
    }

    fun getTransportedComfortably(): Transport {
        return Limousine()
    }
}

class Driver {
    var cheepTransportation: Transport
    var comfortableTransportation: Transport

    init {
        val carStore = CarStore()
        cheepTransportation = carStore.getTransported()
        comfortableTransportation = carStore.getTransportedComfortably()
    }

    fun driving() {
        cheepTransportation.drive()
        comfortableTransportation.drive()
    }
}

fun main() {
    val driver: Driver = Driver()

    driver.driving()
}