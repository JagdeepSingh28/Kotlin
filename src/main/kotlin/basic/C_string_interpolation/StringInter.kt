package basic.C_string_interpolation

fun main() {
    val name = "Bob";

    println("Hello $name    $name, how are you?  ")

    //-------Multiline String

    val memo = """
        ~This message was created by $name and
        ~is being delivered
        ~securty to...
        """

//    println(memo)

//    println(memo.trimMargin())
//
    println(memo.trimMargin("~")) //replace | with ~, for example.
}