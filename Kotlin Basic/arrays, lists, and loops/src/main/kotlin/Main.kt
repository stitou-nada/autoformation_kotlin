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
    //intArrayOf
    val numbers = intArrayOf(1,2,3)
    val numbers3 = intArrayOf(4,5,6)
    val foo2 = numbers3 + numbers
    println(foo2[3])

    // Loop 
    val school2 = arrayOf("nada", "salmon", "minnow")
    for (element in school2) {
    print(element + " ")
    }


}