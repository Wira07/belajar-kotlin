fun main() {
    val ranges = 1..5
    for (i in ranges){
        println("value is $i!")
    }

    val ranges4 = 1.rangeTo(5)
    for (i in ranges4){
        println("value is $i!")
    }

    val ranges2 = 1.rangeTo(10) step 3
    ranges2.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    val ranges3 = 1.rangeTo(10) step 3
    ranges3.forEachIndexed { index, _ ->
        println("index $index")
    }
}
fun main2() {

}