object Util {
    var core : Int = 2
    fun getNumberOfCores() = core ;//Runtime.getRuntime().availableProcessors()
}

class Car {
    companion object { //May optionally take a name after object, for example CarKind
        fun kind() = "Electric"
    }

    fun drive() { println("driving") }
}

fun main() {

    println(Util.getNumberOfCores())

    Util.core = 4
    println(Util.getNumberOfCores())

    val car = Car()
    car.drive()

    println(Car.kind())

    val companion = Car.Companion //If CarKind is used above, then Car.CarKind
    println(companion.kind())
}