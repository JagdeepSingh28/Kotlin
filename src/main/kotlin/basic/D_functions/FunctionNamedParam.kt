package basic.D_functions

fun greet(name: String, msg: String = "Hi ${name.length}") = "$msg $name"

fun main() {
    println(greet("Tom", "Hello"))
    // Default Arguments
    println(greet("Jerry"))
    // Named Arguments
    println(greet(msg = "Howdy", name = "Spike"))
    println(greet("Tyke", msg = "Yo"))
}