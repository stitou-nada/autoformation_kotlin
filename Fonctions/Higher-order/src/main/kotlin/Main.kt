fun main(args: Array<String>) {

    Sum(::calc)

}
//exemple normal functions
fun Sum(operation:(num1:Int ,num2:Int)->Int){
    println(operation(3,4))
}
fun calc(n1:Int,n2:Int):Int{
    return  n1 + n2
}