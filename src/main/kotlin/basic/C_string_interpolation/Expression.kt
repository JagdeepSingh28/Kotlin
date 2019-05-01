package basic.C_string_interpolation

fun main() {
    val age = 19

//    var canVote : String = ""
//    if(age > 17)
//        canVote = "Please vote"
//    else
//        canVote = "Not so fast, kid"

    val canVote =
        if(age > 17) {
            println("17 above")
            "Please vote"
        } else {
            println(age)
            "Not so fast, kid"
        }
    println(canVote)

}