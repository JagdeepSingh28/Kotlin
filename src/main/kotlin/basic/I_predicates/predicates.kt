package basic.I_predicates

fun main() {

    val myNums = listOf(2, 4, 6, 8, 10)

    /***
     * All will return TRUE or FALSE if all elements in the collection are satisfying given condition or not
     */
//    val checkAll = myNums.all { num -> num > 5 }
    val checkAll = myNums.all { it > 5 }
    println("checkAll -> $checkAll")

    val checkAny = myNums.any { it > 5 }
    println("checkAny -> $checkAny")

    // This will return total no. of count of elements satisfying the condition
    val checkCount = myNums.count{ it >5 }
    println("checkCount -> $checkCount")

    // This will return first element satisfying the condition
    val checkFind = myNums.find { it>5 }
    println("checkFind -> $checkFind")

}