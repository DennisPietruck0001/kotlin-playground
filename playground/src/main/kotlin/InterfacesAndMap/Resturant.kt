package InterfacesAndMap

interface Resturant {
    fun provideFood()
    fun provideBill()
}

class LocalResturant: Resturant {
    override fun provideFood() {
        println("Your local resturant provides food.")
    }

    override fun provideBill() {
        println("Please pay 25€")
    }
}


class FancyResturant: Resturant {
    override fun provideFood() {
        println("Here you get fancy food for Instagram pictures.")
    }

    override fun provideBill() {
        println("Please pay the price you cannot afford with your apprenticeship salary.")
    }
}

fun main() {
    val resturant1: Resturant = LocalResturant()
    resturant1.provideFood()
    resturant1.provideBill()


    val resturant2: Resturant = FancyResturant()
    resturant2.provideFood()
    resturant2.provideBill()
}