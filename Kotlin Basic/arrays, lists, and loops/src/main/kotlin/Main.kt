fun main() {

    //listOf cannot changed 
    val school1 = listOf("mackerel", "trout", "halibut")
    println(school1)

    //can mutableListOf changed
     val myList = mutableListOf("tuna", "salmon", "shark")
    myList.remove("shark")
     println(myList)

    //arrayOf
    val school = arrayOf("shark", "salmon", "minnow")
    println(java.util.Arrays.toString(school))

    // Loop 
    val school2 = arrayOf("shark", "salmon", "minnow")
    for (element in school2) {
    print(element + " ")
    }


}