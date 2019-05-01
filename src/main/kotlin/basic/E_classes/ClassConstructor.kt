package basic.E_classes

fun main(args: Array<String>) {

    var student = Student("Steve", 10)

    println(student.id)
}


class Student private constructor(var name: String) {
// right now name is property if we remove name then it is jus parameter
// and not accessible by object
    var id: Int = -1

    init {
        // If we are re assigning the property of class only then we need Val Or var
//        name = "de"
        println("Student has got a name as $name and id is $id")
    }

    // properties are not allowed in secondary constructor
    constructor(n: String, id: Int): this(n) {
        // The body of the secondary constructor is called after init block
        this.id = id
    }
}