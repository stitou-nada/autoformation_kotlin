fun main() {
    val peopleAges = mutableMapOf<String, Int>(
        "Fred" to 30,
        "Ann" to 23
    )
    //ajouter d'autres entrées à la map, vous pouvez utiliser la fonction put(), en transmettant la clé et la valeur
    peopleAges.put("Barbara", 42)
    peopleAges["Joe"] = 51
    peopleAges["Fred"] = 31
    println(peopleAges.map { "${it.key} is ${it.value}" }.joinToString(", ") )
    val filteredNames = peopleAges.filter { it.key.length < 4 }
    println(filteredNames)
    //println(peopleAges)
}