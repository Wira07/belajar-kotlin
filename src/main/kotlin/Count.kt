fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList.count())

//  Output 10
    val numberList2 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    print(numberList2.count { it % 3 == 0 })

// firstOddNumber: 1
// firstOrNullNumber: null

    val numberList3 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val moreThan10 = numberList3.first { it > 10 }
    print(moreThan10)

    val numberList4 = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val total = numberList4.sum()
    println(total)

    // total: 55
}