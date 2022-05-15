package Arrays.Lists

fun main() {

    // write your code here
    var firstNum = 0
    var secondNum = 1
    var sum:Int =0
    println("$firstNum")
    println("$secondNum")
    for(i in 3..10) {

        sum = firstNum + secondNum
        firstNum = secondNum
        secondNum = sum


        println(sum)


    }

}