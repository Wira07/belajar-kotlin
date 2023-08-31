open class Employee(val name: String) {
    fun sayHello(name: String) {
        println("Hello $name, my name is ${this.name}")
    }
}

class Manager(name: String) : Employee(name)
class ManagerBabu(name: String) : Employee(name)

fun main() {
    val Manager = Manager("EIra")
    Manager.sayHello("Wira")

    val ManagerBabu = ManagerBabu("Budi")
    ManagerBabu.sayHello("Abah")
}