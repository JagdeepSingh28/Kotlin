package basic.D_functions.java_interoperabilty


fun main() {

    var area = MyJavaFile.getArea(10, 5)
    println("Printing area from Kotlin file: $area")


    println(findVolume(10,20,30))       // OKAY


}

fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

@JvmOverloads
fun findVolume(length: Int, breadth: Int, height : Int) : Int{
    return length * breadth * height
}