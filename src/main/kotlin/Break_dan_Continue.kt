fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
    for ( a in listOfInt) {
        println(a)
    }

    val listOfInt2 = listOf(1, 2, 3, null, 5, null, 7)
    for (i in listOfInt2) {
        if (i == null) continue
        print(i)
    }

    val listOfInt3 = listOf(1, 2, 3, null, 5, null, 7)
    for (b in listOfInt3) {
        if (b == null) break
        print(b)
    }
}