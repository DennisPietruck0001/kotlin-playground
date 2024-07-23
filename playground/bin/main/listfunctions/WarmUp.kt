package listfunctions

fun minValue(myList: List<Int>): Int {
    return myList.min()
}

fun minForLoop(myList: List<Int>): Int {
    var min = myList[0]
   for(num in myList) {
       if(num < min) {
           min = num
       }
   }
    return min
}

fun maxValue(myList: List<Int>): Int {
    return myList.max()
}

fun maxForLoop(myList: List<Int>): Int {
    var max = myList[0]
    for(num in myList) {
        if(num > max) {
            max = num
        }
    }
    return max
}

fun revert(myList: List<Int>): List<Int> {
    return myList.reversed()
}

fun reverseForLoop(myList: List<Int>): List<Int> {
    val newList = mutableListOf<Int>()
    for(i in myList.size-1 downTo 0) { // i steht mit range für index
        newList.add(myList[i])
    }
    return newList
}

fun concat(myFirstList: List<Int>, mySecondList: List<Int>): List<Int> {
    return myFirstList + mySecondList
}

fun concatForLoop(myFirstList: List<Int>, mySecondList: List<Int>): List<Int> {
    val newList = mutableListOf<Int>()
    for(i in myFirstList) { // i steht für das Element
        newList.add(i)
    }
    for(i in mySecondList) {
        newList.add(i)
    }
    return newList
}

fun indexOfList(myListOfStrings: List<String>, myString: String): Int? {
    for(i in myListOfStrings.indices) { // i steht für Index
        if(myListOfStrings[i] == myString) {
            return i
        }
    }
    return null
}

fun sumOfInt(myList: List<Int>): Int {
    var sum: Int = 0
    for(i in myList) {
        sum = sum + i
    }
    return sum
}

fun createMatrix(m: Int, n: Int): List<List<Int>> {
    var bigList = mutableListOf<List<Int>>()
    for(i in 1..m) {
        var smallList = mutableListOf<Int>()
        for(j in 1..n) {
            smallList.add(j+i*10)
        }
        bigList.add(smallList)
    }
    return bigList
}

fun main() {
    val myList: List<Int> = listOf(7,3,8,5)
    val minResult = minValue(myList)
    println(minResult) // 3

    val minResult2 = minForLoop(myList)
    println(minResult2) // 3

    val maxResult = maxValue(myList)
    println(maxResult) // 8

    val maxResult2 = maxForLoop(myList)
    println(maxResult2) // 8

    val myList2: List<Int> = listOf(1,2,3,4,5)
    val reversedResult = revert(myList2)
    println(reversedResult)

    val secondReversedResult = reverseForLoop(myList2)
    println(secondReversedResult)

    val bothLists = concat(myList, myList2)
    println(bothLists)

    val bothListsForLoop = concatForLoop(myList, myList2)
    println(bothListsForLoop)

    println("---------------------------------------------")

    val myListOfStrings = listOf("Foo","Bar","Baz")
    val result1 = indexOfList(myListOfStrings, "Hi")
    println(result1)

    println("---------------------------------------------")
    val empthyList = emptyList<String>()
    val result3 = empthyList.firstOrNull()
    println(result3)

    println("---------------------------------------------")

    val myListOfNum = listOf(4,5,6,7,5)
    val sumResult = sumOfInt(myListOfNum)
    println(sumResult)

    println("---------------------------------------------")

    val myMatrix = createMatrix(4, 2)
    println(myMatrix) // [[11,12,13],[21,22,23], [31,32,33]]
}