package basic.H_collections

fun main() {

    // Key-Value Pair

    //  IMMUTABLE, FIXED SIZE, READ ONLY
    var myMap = mapOf<Int, String>(1 to "ABC", 2 to "DEF", 3 to "GHI")

//    myMap.put // NOT POSSIBLE

    for(keys in myMap.keys)
        println("Element at key $keys is ${myMap[keys]}")


    var myHashMap = HashMap<Int, String>()
    myHashMap.put(1, "AAA")
    myHashMap.put(2, "BBB")
    myHashMap.put(3, "CCC")

    myHashMap.put(2,"ZZZ")

//    myMap.put // NOT POSSIBLE

    for(keys in myHashMap.keys)
        println("Element at key $keys is ${myMap[keys]}")
}