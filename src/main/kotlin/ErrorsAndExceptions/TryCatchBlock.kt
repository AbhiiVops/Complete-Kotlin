package ErrorsAndExceptions

import java.util.*

fun main() {

    val d = arrayOf(3,4,5,6)

    try {
        d[4]= 9
        println("I ran and changed the value")
    }
    catch(e : Exception) {  // --> If you dont know the
        // name of the exception then simply write exception
        println("I ran and caught the exception")
    }
//    finally { // this finally is optional so we can also write it as
//        println(d.contentToString())
//    }


   // println(Arrays.toString(d))
    println(d.contentToString())
    // Above both can be the ways to print the array
}