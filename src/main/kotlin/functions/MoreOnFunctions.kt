fun main() {


    iAmFunction() // -> Invoking a function
    println(timesTwo(5))
    println(timesThree(4))
    println(timesFour(5))


}

     fun iAmFunction() = println("I am your new function")

fun timesTwo(a: Int): Int {

    return a * 2
}


fun timesThree(b:Int):Int {
    return b*3
}


fun timesFour(b:Int):Int {
    return b*4
}






