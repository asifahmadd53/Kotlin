package main.kotlin

// simple object that stores multiple value of same type
// fixed in size
fun main(){
    var arr = arrayOf("One", "Two", "Three")
    var arr2 = arrayOf(1,24,5)


    println(arr.joinToString ())

    for((i,e) in arr2.withIndex()){
        println("$i - $e")
    }

//    println(arr[0])
    println(arr.get(2))
    println(arr.size)

}


