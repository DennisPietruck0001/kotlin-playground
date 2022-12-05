package orderTables

class Person(val name: String, val age: Int, val city: String, val country: String) {

    fun showInfo() { println("Name: $name \nAge: $age \nCity: $city \nCountry: $country \n-------------------") }
    fun arrest() { println("$name is arrested") }
}

fun showNames(listOfPersons: List<Person>) { println(listOfPersons.joinToString(" ") { it.name }) }

fun showAges(listOfPersons: List<Person>) { println(listOfPersons.map { it.age }.joinToString("     ")) }

fun showCity(listOfPersons: List<Person>) { println(listOfPersons.joinToString(" ") { it.city }) }

fun showCountry(listOfPersons: List<Person>) { println(listOfPersons.joinToString(" ") { it.country }) }

fun showAllInfo(listOfPersons: List<Person>) {
    println("----------------------------------------------------")
    println("Names:  " + listOfPersons.map { it.name }.toString().replace("[^A-Za-z ]".toRegex(), " "))
    println("Ages:   " + listOfPersons.map { it.age }.toString().replace("[^ 0-9]".toRegex() , "    "))
    println("Cities:    " + listOfPersons.map { it.city }.toString().replace("[^A-Za-z ]".toRegex(), ""))
    println("Countries: " + listOfPersons.map { it.country }.toString().replace("[^A-Za-z ]".toRegex(), ""))
    println("----------------------------------------------------")
}

fun filterAge(listOfPersons: List<Person>, x: Int, y: Int) { println(listOfPersons.filter { it.age in x..y }.associate { it.name to it.age }) }

fun filterCountry(listOfPersons: List<Person>, country: String) { println(listOfPersons.filter { it.country == country }.map { it.name to it.city }) }

fun arrestThem(listOfPersons: List<Person>) { listOfPersons.filter { person: Person -> person.name.length > 5 }.forEach { it.arrest() } }

fun main() {
    val person1: Person = Person("Sorour", 21, "Hamburg", "Germany")
    val person2: Person = Person("Laura", 21, "Berlin", "Germany")
    val person3: Person = Person("Lauren", 22, "Paris", "France")
    val person4: Person = Person("Robin", 35, "Toronto", "Canada")
    val people = listOf(person1, person2, person3, person4)
    person2.showInfo()
    showNames(people)
    showAges(people)
    showCity(people)
    showCountry(people)
    showAllInfo(people)
    filterAge(people, 20, 30)
    filterCountry(people, "Germany")
    arrestThem(people)
}