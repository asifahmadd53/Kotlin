package main.kotlin


fun main(){
//    val isRaining = true
//
//    if(isRaining == true){
//        println("Take umbrella")
//    }else{
//        println("You can go without Umbrella")
//    }

    val x = 10;
    val y= 10

    val result = if (x > y){
        "X is greater than Y"
    }
    else if(x < y){
        "Y is greater than X"
    }
    else
    {
        "Both are equal"
    }
    print(result)



    val number  = 21;
    val ans = if (number % 2 == 0 ) "Even" else "Odd"

    println(ans)

}