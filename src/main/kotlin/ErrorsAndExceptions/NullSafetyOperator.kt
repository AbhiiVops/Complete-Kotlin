package ErrorsAndExceptions

fun main() {

//    var a = null
//    println(a)

   // var nullValue :String = null // -->Error: Null cannot be a value of non null tye string
    var nullValue :String? = null // --> use null safety operator (?)
 //    println(nullValue) // --> it will print null
  //  println(nullValue?.length ) // to use the methods of Strings it would be String?.length etc..

  // println(nullValue!!.length) // --> Non null asserted call forces the ide to give an output
                                // which is not null which results in a program crash

    // so we only use the safe call(?.) in the case
    println(nullValue?.length ?: "This is null") // --> to print some value or message when
                                          // the value is null we use the
                                         //     Elvis Operator ?:
}