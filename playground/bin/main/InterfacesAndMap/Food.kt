package InterfacesAndMap

interface Food {
    fun feed()
}

class FastFood: Food {
    override fun feed() {
        println("Fast food will feed you.")
    }
}

class Frenchfood: Food {
    override fun feed() {
        println("French food will feed you & delight you.")
    }
}

class FastFoodResturant {
    fun buyFood(): Food {
        return FastFood()
    }
}

class FrenchResturant {
    fun todaysSpecial(): Food {
        return Frenchfood()
    }
}

fun main() {
    var myFood: Food = FastFoodResturant().buyFood()
    myFood.feed()

    myFood = FrenchResturant().todaysSpecial()
    myFood.feed()
}