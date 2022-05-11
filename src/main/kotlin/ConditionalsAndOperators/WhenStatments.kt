package ConditionalsAndOperators

fun main() {

    // Declare an integer variable and use the 'when' expression to print the integer in words
    var  a= 90

    when(a){

        // In When statements there is a jumping of the statements
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Invalid number")  // --> This is not mandatory
    }

}