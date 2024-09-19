package main.kotlin

fun main (){
    var i: Int = 20
    println(i.plus(30))
    println(i.toFloat())
    val p1 = Person("A", 21)
    val p2 = Person("B", 18)

    println(p1.canVOte())
    println(p2.canVOte())
}
class Person (val name: String, var age: Int){
    fun canVOte(): Boolean{
        return age > 18
    }
}