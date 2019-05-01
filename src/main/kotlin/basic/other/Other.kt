package basic.other

fun main(args: Array<String>) {
    var a = 2
    println(someMethod(a, {println("Just some dummy function")}))
}
fun someMethod(a: Int, func: () -> Unit):Int {
    func()
    return 2*a
}