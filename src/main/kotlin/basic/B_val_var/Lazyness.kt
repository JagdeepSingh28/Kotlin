package basic.B_val_var

import basic.D_functions.add

class Lazyness {
//    private var text : String    // Not Possible
    var text : String = "Text"    // Possible
    lateinit var text2 : String     // Possible
}

fun main(args: Array<String>) {

    //------------ LATE INIT ---------------

    val user = Lazyness()

    println(user.text)

    user.text2 = "Hello"
    println(user.text2)

    //-----------LAZY By ------------------

    fun compute(n: Int) : Int {
        println("called...")
        return n
    }

    val x = 4

    if(x > 4 && compute(4) > 2)
        println("result")

    println("----")

    val temp = compute(4)
    if(x > 4 && temp > 2)
        println("result")

    println("----")

    //  Here we are saying that it temp2 will hold the value by Compute function once temp2 will be called
    //  otherwise it will not be computed
    val temp2 by lazy { compute(4) }
    if(x > 4 && temp2 > 2)
        println("result")

    // Next Temp2 is called it will called from the cached memory
    println(temp2)

    // ‘lazy initialization’ was designed to prevent unnecessary initialization of objects.
    // You variables will not be initialised unless you use it in your code
    // It is initialized only once. Next time when you use it, you get the value from cache memory.

    // It is thread safe
    // It is initialized in the thread where it is used for the first time.
    // Other threads use the same value stored in the cache

    // The variable can be var or val.
    // The variable can be nullable or non-nullable

}
