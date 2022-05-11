package ConditionalsAndOperators

fun main() {

    // Declare a variable and check if it lies within a specific range

    // One way is to use a nested if else ladder along with the logical operators
    // But we will do it with the help of 'in' operator
    check(20)

    val a ="Abhii"
    println(a.length)
}

fun check(num:Int) {
    when(num) {
        in 1..10 -> println("B/w 1 to 10")
        in 11..20 -> println("b/w 11 to 20")
        else -> println("None")
    }


}