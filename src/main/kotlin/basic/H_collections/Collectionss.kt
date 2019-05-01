package basic.H_collections

fun main() {


    // Mutable - Fixed Size
    var myArray = Array<Int>(5) {0}  // Lamda as second paramter

    myArray.forEach(::println)

    myArray[0] = 21

    println(myArray[0])

    for (element in myArray)
        println(element)

    for (index in 0..myArray.size-1)
        println(myArray[index])
}