package basic.D_functions

import javax.print.DocFlavor

/***
 *  They must be member functions or extension functions;
    They must have a single parameter;
    The parameter must not accept variable number of arguments and must have no default value.

 */

class Pizza {
    infix fun spread(item: String) {
        println("spreading $item")
    }
}

fun main() {

    val pizza = Pizza()

    pizza.spread("Sauce")
    pizza.spread("Cheese")

    pizza spread "Sauce"
    pizza spread "Cheese"
}