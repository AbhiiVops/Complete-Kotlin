package ConditionalsAndOperators

fun main() {

    // Declare two variables and assign them integer values. Check which of these two variables is greater and assign the
    // value of this variable to another variables called maxValue

    println(maxVal(45,23))

}

fun maxVal(a:Int,b:Int):Int {

    /*

    // Block body

     var maxValue:Int
    if(a>b)
        maxValue = a
    else
        maxValue = b

    return maxValue

    */

    // Expression  body

    var maxValue:Int = if(a>b) a
    else b

    return maxValue



}