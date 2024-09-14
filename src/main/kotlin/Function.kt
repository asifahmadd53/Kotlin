package main.kotlin

fun main(){
    val result = add(2,5)
    println(result)
    val evenodd = evenOdd(4)
    println(evenodd)
//    println(printMessage())
    println(printMessage())
}
//
//fun printMessage (){
//    for (i in 1..10){
//        println("Hii my name is Asif")
//    }
//}
//
//fun printMessage (count: Int){
//    for (i in 1..count){
//        println("Hii my name is Asif")
//    }
//}


fun printMessage (count: Int = 2 ){
    for (i in 1..count){
        println("Hii my name is Asif")
    }
}


//fun add( num1: Int, num2: Int): Int
//{
//    val sum = num1 + num2
//    return sum
//}
fun add( num1: Int, num2: Int) = num1 + num2

fun evenOdd(num: Int)
{
    val result = if(num % 2  == 0) "Even" else "Odd"
    println(result)
}