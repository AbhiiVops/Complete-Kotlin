package Arrays.Lists

// Create a list which contains math function operators (+, -, *, /) as characters. Iterate through this list and pass two variables along with the list item (operator) to a function and perform all the math functions on them. Perform the operation corresponding to the character encountered by the iterator.
//Given:
//Index of + is 0
//Index of - is 1
//Index of * is 2
//Index of / is 3
//In case of division check if the divisor is 0 or not.

fun main() {

    // write your code here
    val operators = listOf('+','-','*','/')
    for(i in 0 until operators.size){
        var value = compOp(100,10,operators[i])
        println(value)
    }


}

fun compOp(a:Int,b:Int,operator:Char):Int {
    var c =0
    if(operator ==  '+')
        c =a+b
    else if(operator == '-')
        c= a-b
    else if(operator == '*')
        c=a*b
    else if(operator == '/') {
        if(b!= 0) {
            c= a/b
        }

    }
    return c
}