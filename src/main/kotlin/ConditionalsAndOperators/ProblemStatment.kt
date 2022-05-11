package ConditionalsAndOperators

fun main() {

    // when statement ques

    //Declare an integer variable and print 'positive' if the number is greater than zero
    // 'negative' if the no. is less than zero, and 'zero' if the no. is zero

    comp(-91)

}

fun comp(num:Int) {

    when {    //--> here we have not included the condition inside when statement
              // because there are many conditions that needs to be checked
        num>0 -> println("Positive")
        num<0 -> println("Negative")
        num==0 -> println("Zero")
    }
}
