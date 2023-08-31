class Calculator {
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun add(a: Int, b: Int, c: Int): Int {
        return a + b + c
    }
}

fun main() {
    val calc = Calculator()

    val result1 = calc.add(2, 3)
    println("Result 1: $result1")  // Output: Result 1: 5

    val result2 = calc.add(2.5, 3.5)
    println("Result 2: $result2")  // Output: Result 2: 6.0

    val result3 = calc.add(1, 2, 3)
    println("Result 3: $result3")  // Output: Result 3: 6
}
