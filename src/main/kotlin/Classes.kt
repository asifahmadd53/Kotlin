package main.kotlin

fun main() {
    val mustang = Car("Mustang", "petrol", kmRun = 1000)
    val beetle = Car("Beetle", "diesel", kmRun = 500)
    println(mustang.name)
    println(mustang.type)

    println(beetle.name)
    mustang.driveCar()
    beetle.driveCar()
}
class Car(val name: String, val type: String, var kmRun: Int) {
    fun driveCar() {
        println("The $name is driving")
    }
    fun applyBrakes() {
        println("Brakes applied")
    }
}