fun main() {
    class Animal(val name: String,
                 val weight: Double,
                 val age: Int,
                 val isMammal: Boolean
    ) {

        fun eat(){
            println("$name makan !")
        }

        fun sleep() {
            println("$name tidur !")
        }
    }
}