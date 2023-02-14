package Secondaire_constructeurs

class Person {
    constructor(name : String , age:Int , city:String ){
        println("my name is $name am $age years old in $city ")
    }
    constructor():this("butaina",24,"tanger"){
        print("secondary constracture ")
    }
    init {
        println("aquarium initializing")
    }
}