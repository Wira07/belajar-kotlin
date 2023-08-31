class People {
    var firstname: String = ""
    var middlename: String? = null
    var lastname: String = ""

    fun bagi(firstname: String, lastname: String) {
        println("Hello $firstname $lastname, My name is ${this.firstname}")
    }

}

fun main() {
    val nama = People()
    nama.firstname = "Wira"

    nama.bagi("eko","yudi")
}