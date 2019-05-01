package basic.E_classes

class Car {
    var yearOfRegistration = 2010
        set(value) {
          if(value > 2017)
            throw RuntimeException("can't register into the future")
          field = value
        }
        get(){
            return 2000
        }

    val yearsSinceRegistration
        get() = 2017 - yearOfRegistration
}

fun main() {

    val car = Car()

    println(car.yearOfRegistration)

    car.yearOfRegistration = 2019

    println(car.yearOfRegistration)

    println(car.yearsSinceRegistration)

//car.yearOfRegistration = 2019
}