fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val multipliedBy5 = numberList.map { it * 5 }

    println(multipliedBy5)


//    val mutableCapital = capital.toMutableMap()
//    mutableCapital.put("Amsterdam", "Netherlands")
//    mutableCapital.put("Berlin", "Germany")

    println(capital["Jakartalala"])
    println(capital.getValue("Jakarta"))



}