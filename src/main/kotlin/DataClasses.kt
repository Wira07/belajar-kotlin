class User(val name : String, val age : Int) {
    override fun equals(other: Any?): Boolean {
//        override fun toString(): String {
//            return "User(name=$name, age=$age)"
//        }

        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }

//        return "User(name=$name, age=$age)"
}

data class DataUser(val name : String, val age : Int) {
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main() {
//    val user = User("nrohmen", 17)
//    val dataUser = DataUser("nrohmen", 17)
//
//    println(user)
//    println(dataUser)

    val dataUser6 = DataUser("nrohmen", 23)
    dataUser6.intro()

    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5)
    println(dataUser4)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
}

