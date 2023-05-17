fun main() {
    val words = listOf("about", "acute", "awesome", "balloon", "best", "brief", "class", "coffee", "creative")
    //La fonction startsWith() renvoie la valeur "true" si une chaîne commence par la chaîne spécifiée. Vous pouvez également lui dire d'ignorer la casse pour que "b" corresponde à "b" ou "B".
    val filteredWords = words.filter { it.startsWith("c", ignoreCase = true) }
        .shuffled()
        .take(2)
        .sorted()
    println(filteredWords)
}