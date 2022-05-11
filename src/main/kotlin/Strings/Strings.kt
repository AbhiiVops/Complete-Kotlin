fun main() {

    val s = "Welcome to Internshala ";  ///- > first way of declaring
    var str:String = "Welcome to internshala"; // --> second way of declaring
    // Here var can be changed to val since value inside the string will never change.They are immutable.

    val str1:String = "Abhishek"
//
//    println(s)
//    println(str)

    // String functions
    println(str.length)   // -> Returns the length of this character sequence.
    println(str.get(4))  //-> Returns the character of this string at the specified index.
    println(str.subSequence(4,7))  //-> Returns a new character sequence that is a subsequence of this character sequence,
                                 // starting at the specified startIndex and ending right before the specified endIndex.
    println(str1.compareTo(str))  //-> compares this object with the specified object for order.
                                 // Returns zero if this object is equal to the specified other object,
                                 // a negative number if it's less than other, or a positive number if
                                 // it's greater than other.
    println(str.compareTo(str1,false))
    println(str.equals(str1))  // -> Indicates whether some other object is "equal to" this one.
    println(str.hashCode())  //-> Returns a hash code value for the object.
    println(s.plus(str1))  //-> Returns a string obtained by concatenating this string with the string representation of the given other object.
    println(str.lastIndexOf('a',4)) //-> Returns the index of the last character in the char sequence or -1 if it is empty.
    println(str.lastIndexOf('b',1,true))
    println(str.contains("internshala",false)) // --> Returns true if this char sequence contains the specified other sequence of characters as a substring.
    println(str.contains('z',false))
    println(str.contentEquals("Welcome to internshala",false)) // --> this should match with the complete content of str
    println(str.count()) //-> Returns the length of this char sequence.
    println(str.endsWith("a",false))
    println(str.endsWith('a',true))
    println(str.toString())
    println(str.indexOf('t',0,false))


//    val i =10
//    println("The value of i is $i")  // --> This way of printing the value in a string is known as string template
//                                     // it always starts with a dollar sign
//
//
//    println("The value at index 4 is ${str.get(4)}")

    // --> when we want to use string template for a simple value  we use  $ sign
    // --> but when we wish to use the string template for an expression or string function we use ${}
}