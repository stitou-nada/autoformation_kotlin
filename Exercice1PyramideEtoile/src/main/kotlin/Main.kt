fun main() {

    val n=5
    var i: Int=0
    var j: Int
    var space: Int
    while (i<n)
    {
        space=i
        while (space<n)
        {
            print(" ")
            space++
        }
        j=0
        while (j<i+1)
        {
            print("* ")
            j++
        }
        println("")
        i++
    }

}