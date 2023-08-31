class Person(name: String, nana: String, age: Int = 2021) {
//    init {
//        println("Hallo ${String} Dipiceun")
//    }
    var firstname = name
    var usia = age
    var middlename = nana

//    constructor(firstname: String, middlename: String, lastname: String) : this(firstname, usia, middlename)
}

fun main() {
    val wira = Person("Wira Sukma Saputra", "Kiki", 21)
    val wira2 = Person("Fakultas Ilmu Komputer", "Jaja", 22)
    
    println(wira.firstname)
    println(wira.usia)
    println(wira.middlename)

    println(wira2.firstname)
    println(wira2.usia)
    println(wira2.middlename)
}