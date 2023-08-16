fun main() {

    val names: Array<String> = arrayOf("Wira","Sukma","Saputra")
//    names.set(0, "Lucky")
    names[0] = "Lucky"
    println(names[0])


    val baru: Array<String> = arrayOf("YUYU", "Realme", "Sukma", "Saputra")
    baru[0] = "Wildan"
    println(baru[0])

    val jumpa: Array<String?> = arrayOfNulls(5)

    jumpa[0] = "Saputra"
    jumpa[1] = null
    jumpa[2] = null
    jumpa[3] = "Saputra"
    println(jumpa.size)

//    var name: Array<String> = arrayOf("Wira","Sukma","Saputra")
//    println(name)
//
//    val intArray = intArrayOf(1, 3, 5, 7)
//    intArray[3] = 50
//
//    print(intArray[3])

}