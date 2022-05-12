package ConditionalsAndOperators.Loops

fun main() {

    // calculate the sum of the first 100 natural numbers using the concept of loops.

    var sum:Int =0

    for(i in 1..100) {
        sum += i
    }
    println("$sum")

}