package basic.F_when_loop

fun process(input: Any) {
    when(input) {
        1 -> println("That's one")
        7, 8 -> println("7 or 8")
        in 13..19 -> println("teen")
        is String -> println("got a String of length ${input.length}")
        else -> println("no clue")
    }
}

fun main(args: Array<String>) {

    process(1)
    process(7)
    process(8)
    process(16)
    process("hello")  //notice automatic casting
    process(StringBuilder())

    //-----------loop

    loop()
}

fun loop(){
    for (i in 1..10) {

        if (i % 2 == 0) {
            println(i)
        }
    }

    println()

    for (i in 10 downTo 0 step 2) {
            println(i)
    }
}
