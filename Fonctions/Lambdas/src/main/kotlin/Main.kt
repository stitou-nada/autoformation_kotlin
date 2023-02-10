fun main(args: Array<String>) {
    exempleSum()
    exempleCalc()

}

// val lambda_name : Data_type = { parameters -> body } =>
fun exempleSum (){
    val sum : (Int , Int) -> Int = {a:Int , b:Int -> a+b}
    println(sum(1,6))

}

fun exempleCalc(){
    var dirtyLevel = 6
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))
}