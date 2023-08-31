class Mobil (parambrand: String, paramName: String, age: Int) {

    init {
        println("Halo $parambrand Mewah")
    }

     constructor(parambrand: String, paramName: String) : this(parambrand, paramName, 2021) {
        println("Secondary Constructor 1")
    }

    constructor(parambrand: String) : this(parambrand, "") {
        println("Secondary Constructor 2")
    }

    var brand = parambrand
    var name = paramName
    var year = age
}

fun main() {
    val avanza = Mobil("Bagus")
    val avanza2 = Mobil("Bagus", "Jaful")

    println(avanza.brand)
    println(avanza2.name)
}