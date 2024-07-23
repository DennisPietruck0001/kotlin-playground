package listfunctions

fun rowSum(myBigList: List<List<Int>>, num: Int): Int {
    var sum: Int = 0
    for(i in myBigList[num]) {
        sum = sum + i
    }
    return sum
}
fun rowSumExample() {
    val myMatrix = listOf(

            listOf(1,2,1),

            listOf(4,1,3),

            listOf(1,12,61),

            )
    var result = rowSum(myMatrix, 0)

    println(result) // 4

    result = rowSum(myMatrix, 1)

    println(result) // 8

    result = rowSum(myMatrix, 2)

    println(result) // 74
}

fun index(myMatrix: List<List<Int>>, rowNum: Int, columnNum: Int): Int {
    return myMatrix[rowNum][columnNum]
}

fun printIndexExample() {
    val myMatrix = listOf(
            listOf(1,2,3),
            listOf(4,5,6),
            listOf(7,8,9),
    )
    var result = index(myMatrix, 0, 0)
    println(result) // 1

    result = index(myMatrix, 0, 2)
    println(result) // 3

    result = index(myMatrix, 2, 1)
    println(result) // 8
}

fun columnSum(myMatrix: List<List<Int>>, columnNum: Int): Int {
    var sum: Int = 0
    for(row in myMatrix) {
        sum += row[columnNum]
    }
    return sum
}

fun printColumnSumExample() {
    val myMatrix = listOf(
            listOf(1,2,1),
            listOf(4,1,3),
            listOf(1,12,61),
    )
    var result = columnSum(myMatrix, 0)
    println(result) // 6
    result = columnSum(myMatrix, 1)
    println(result) // 15
    result = columnSum(myMatrix, 2)
    println(result) // 65
}

fun main() {
    rowSumExample()
    println("------------------")
    printIndexExample()
    println("------------------")
    printColumnSumExample()

}