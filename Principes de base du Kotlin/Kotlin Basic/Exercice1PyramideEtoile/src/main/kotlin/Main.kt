fun main() {

    print("Enter une number : ")

    val n = readLine()!!.toInt()
        var k = 0

        for (i in n downTo 1) {
            for (space in 1..n - i) {
                print("  ")
            }

            while (k != 2 * i - 1) {
                print("* ")
                ++k
            }

            println()
            k = 0
        }






}