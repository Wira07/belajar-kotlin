fun main() {
    val rangeInt = 1..10
    println(rangeInt.step)

    val rangeOn = 1..100 step 2
    rangeOn.forEach{
        println("$it")
    }
    println(rangeOn.step)
}