package basic.B_val_var

const val VENDOR_NAME = "Self Learning Kotlin"
val PICon = getPI()

//const val PICon = getPI()  ->// NOT OKAY as value of getPI is not Known at runtime

fun getPI(): Double {
    return 3.14
}

fun main() {

    println("Vendor Name $VENDOR_NAME")
    println("Value of PI : $PICon")
}