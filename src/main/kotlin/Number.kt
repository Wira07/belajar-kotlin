fun main() {
    val floatNumber: Float = 0.1234567f
    println(floatNumber)

    val shortNumber: Short = 10
    println(shortNumber)

    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE

    println(maxInt)
    println(minInt)

    val byteNumber: Byte = 105
    val intNumber: Int = byteNumber.toInt() // ready to go

    println(intNumber)

    val stringNumber = "23"
    val intNumber2 = 3

    println(intNumber2 + stringNumber.toInt())

    val readableNumber = 1_000_000
    println(readableNumber)

}