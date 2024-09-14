fun main(){
    var count = 1
    while (count <= 5) {
        println("HII Asif")
        count++;
    }

//    val number = 2;
//    var index = 1
//    while (index <= 10){
//        println(number * index)
//        index++
//    }

    var index = 1;
    do {
        println("Hello")
        index++
    }while (index>5)


    for(i in 1..5 step 4){
        println(i)
    }

    for (i in 1 until 5){
        println(i)
    }
    for (i in 10 downTo 1){
        println(i)

    }

    var number = 2
    for (i in 1 .. 10){
//        println("2 x "+i+ " = "+ number * i)
        println("$number x $i = ${number * i}")
    }
}