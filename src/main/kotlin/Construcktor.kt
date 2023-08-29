class Person(name: String, age: Int = 2021) {
    var firstname = name
    var usia = age
}

fun main() {
    val wira = Person("Wira Sukma Saputra", 21)
    val wira2 = Person("Fakultas Ilmu Komputer", 22)
    println(wira.firstname)
    println(wira.usia)
    println(wira2.firstname)
    println(wira2.usia)
}