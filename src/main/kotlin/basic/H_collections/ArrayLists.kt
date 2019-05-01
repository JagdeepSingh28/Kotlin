package basic.H_collections

fun main() {

    // IMMUTABLE , FIXED IN SIZE, READ ONLY
    var list = listOf<String>("ABC", "DEF", "GHI")

//    list[0] = "dew"  // NOT POSSIBLE

    list.forEach(::println)



    // IMMUTABLE , FIXED IN SIZE, READ ONLY
    var mlist = mutableListOf<String>("ABC", "DEF", "GHI")
    mlist.add("JKL")  // POSSIBLE
    mlist[0] = "CBA"

//    list[0] = "dew"  // NOT POSSIBLE

    list.forEach(::println)

}