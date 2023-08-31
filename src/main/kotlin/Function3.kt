class Student(val name: String) {
    var firstname: String = ""
    var middlename: String? = null
    var lastname: String = ""
    fun sayHello(yourName: String) {
        println("Hallo $yourName, My Name Is $name")
    }
    fun run() {
        println("I'm Run")
    }
    fun getFullname(): String {
        return "$firstname $middlename $lastname"
    }
}

fun main() {
    val wira = Student("Body")
    wira.firstname = "Wira"
    wira.middlename = "Sukma"
    wira.lastname = "Saputra"
    wira.sayHello("Wira")
    wira.run()
    val fullname = wira.getFullname()
    println(fullname)
}