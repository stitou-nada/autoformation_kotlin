fun main() {
    //if else
    val numberOfFish = 50
    val numberOfPlants = 23
    if (numberOfFish > numberOfPlants) {
        println("Good ratio!")
    } else {
        println("Unhealthy ratio")
    }

    // In 
    val fish = 50
    if (fish in 1..100) {
    println(fish)
    }

    //When
    val number = 2
    when (number) {
    0  -> println("Empty tank")
    in 1..39 -> println("Got fish!")
    else -> println("That's a lot of fish!")
    }

}