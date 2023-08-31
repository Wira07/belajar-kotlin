class Uniku(firstname: String, middlename: String, age: Int = 2021) {

    init {
        println("Dibuat $firstname Tahun 2023")
    }

    var name = firstname
    var middle = middlename
    var age = Int
}

fun main() {
    val Fkom = Uniku("Wira", "Sukma", 2021)
    println(Fkom.name)
    println(Fkom.middle)
    println(Fkom.age)
}