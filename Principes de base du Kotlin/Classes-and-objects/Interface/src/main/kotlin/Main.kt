fun main(args: Array<String>) {
makeFish()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark : ${shark.color} ")
    shark.eat()
    println("plecostomus : ${pleco.color} ")
    pleco.eat()
    println("age : ${shark.age} ")
    pleco.eat()
}