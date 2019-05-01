package basic.G_lamda

import java.util.*

data class Person(var firstName: String, var lastName: String, var age: Int)

fun main() {
    var people = arrayOf(
                    Person("Alice","A", 20),
                    Person("Bob","A", 32),
                    Person("Charlie","X", 70),
                    Person("David","Y", 33)
    )

    val addOne = { i: Int -> i+1 }
    println(addOne(10))

    println(Arrays.toString(people))

    val result1 = people.filter({ person: Person ->  person.lastName.startsWith("A")})
    println(result1)

    val result2 = people.filter({ person: Person ->  person.lastName.startsWith("A")})
        .map( { person: Person ->  person.firstName})
    println(result2)

    people.filter({ person: Person ->  person.lastName.startsWith("A")})
        .map({ person: Person ->  person.firstName})
        .forEach({ name: String -> println(name)})

    people.filter{ person: Person ->  person.lastName.startsWith("A")}
        .map{ person: Person ->  person.firstName}
        .forEach{ name: String -> println(name)}

    people.filter{ person ->  person.lastName.startsWith("A")}
        .map{ person ->  person.firstName}
        .forEach{ name -> println(name)}

    people.filter{ it.lastName.startsWith("A")}
        .map{ it.firstName}
        .forEach{ println(it)}

    people.filter{ it.lastName.startsWith("A")}
        .map{ it.firstName}
        .forEach(::println)


    val me = people[0]

    me.apply {
        firstName = "Jagdeep"
        lastName = "Singh"
    }

    println(me)

}