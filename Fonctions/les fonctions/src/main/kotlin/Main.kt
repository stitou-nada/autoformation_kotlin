import java.util.*

fun main(args: Array<String>) {
    exemple2.feedTheFish()
}

fun feedTheFish() {
    val day = exemple2.randomDay()
    val food = "pellets"
    println ("Today is $day and the fish eat $food")
}


fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(week.size)]
}


