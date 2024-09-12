fun main (){
    val animal = "Mouse"
    val result = when(animal){
        "Horse " -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Mouse" -> println("Animal is Mouse")
        else -> "Animal is not found"
    }
    println(result)



}