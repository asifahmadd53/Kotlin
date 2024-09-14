package main.kotlin

import kotlin.math.pow

fun main(){
    println(addition(a = 15, b = 44)) // named argument
    println(addition(15.5, 44.2))

    var fn = ::power
    println(fn(2.4,3.5))
}

fun addition (a:Int, b: Int):Int{
    return a + b
}
fun addition (a: Double, b: Double):Double{
    return a + b
}

fun power(a:Double, b: Double):Double{
    return a.pow(b)
}