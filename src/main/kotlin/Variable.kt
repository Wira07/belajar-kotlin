const val APP = "Mobile Develover"
const val VERSION = "0.0.1.2"

fun main() {
    val firstname: String = "Wira"
    val age = 21

    println(firstname)
    println(age)

    var name: String? = null
    name = "Sukma Saputra"
    println(name)
    println(name?.length)

    println("$APP $VERSION")
}