package basic.G_lamda

data class Person2(var firstName: String, var lastName: String, var age: Int){
    fun prinrPerson() = println(this.toString())
}

fun main() {
    val firstPerson = Person2("Alice","A", 20)
    val secondPerson = Person2("Bob","A", 32)

    val olderPerson = if(firstPerson.age >= secondPerson.age ) firstPerson else secondPerson
    olderPerson.prinrPerson()

    //----RUN------
    run {
        if(firstPerson.age >= secondPerson.age ) firstPerson else secondPerson
        // run returns result from the above statement
    }.prinrPerson()

    //-----WITH-----
    with(firstPerson){
        age +=1
        "age is now $age"
    }.println()

    //----APPLY-----
    firstPerson.apply {
        firstName = "Jagdeep"
        if(firstPerson.age >= secondPerson.age ) firstPerson else secondPerson
//        apply return object on which apply ahs been applied
    }.prinrPerson()

    //----LET----
    var name : String? = "Kotlin let null check"
    name?.let { println(it) } //prints Kotlin let null check
    name = null
    name?.let { println(it) } //nothing happens

    //-----ALSO=----
    var m = 1
    m = m.also { it + 1 }.also { it + 1 }
    println(m) //prints 1

}


fun String.println() = println(this)