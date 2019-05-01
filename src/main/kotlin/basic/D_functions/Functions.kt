package basic.D_functions

fun main() {
    println(findArea(2,3))
    println(findArea2(3,3))
}

fun findArea(len : Int, breadth: Int) : Int{
    return len * breadth
}

fun findArea2(len : Int, breadth : Int) = len * breadth