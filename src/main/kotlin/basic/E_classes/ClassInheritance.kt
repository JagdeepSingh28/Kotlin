package basic.E_classes

fun main(args: Array<String>) {

    var dog = TheDog("Black", "Pug")
    dog.eat()
}

/**
 * All Classes are public and Final in nature
 * To make it accessible to child class we have to use keyword open
 * and same applies for the methods
 */
open class TheAnimal {      // Super class / Parent class /  Base class

    var color: String = ""

    constructor(color: String) {
        this.color = color
        println("From Animal: $color")
    }

    open fun eat(){
        println("Eating")
    }

}

class TheDog : TheAnimal {    // Sub class / Child class / Derived class

    var bread: String = ""

    constructor(color: String, breed: String): super(color) {
        this.bread = breed

        println("From Dog: $color and $breed")
    }

    override fun eat(){
        println("dog is eating")
    }

}