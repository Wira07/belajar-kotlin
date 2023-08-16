fun main() {
    var firstname: String = "Wira"
    var middlename: String = "Sukma"
    var lastname: String = "Saputra"
    var address: String = """
       asal dari indonesia
       kuningan jawa barat
       sidaraja ciawigebang
    """.trimMargin()

    println(firstname)
    println(middlename)
    println(lastname)
    println(address)


    var fullname: String = "$firstname $middlename $lastname"
    println(fullname)

    var desc: String = "$fullname length = ${fullname.length}"
    println(desc)


    val text  = "Kotlin"
    for (char in text){
        print("$char ")
    }

    val name = "Unicode test: \u00A9"
    print(name)
}