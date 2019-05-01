package basic.B_val_var

fun main() {

    // 1. Here we define String, Int, Boolean which are class in Kotlin as it has no Primitive types

    var name = "Harry"
    var age = "24"
    var isAlive: Boolean = true
    var marks: Float = 88.8F
    var percentage: Double = 90.0
    var gender: Char = 'M'


    name = "Harry"  //-> Compile Time Error as val is Immutable and can't be changed
//    age = 25           // var can be changed as it is mutable in nature

    println(name)
    println(age)

}