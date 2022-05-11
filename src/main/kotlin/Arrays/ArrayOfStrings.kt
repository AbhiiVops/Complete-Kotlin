package Arrays

import java.util.*

fun main() {

    val StringArray = arrayOf("Hello","Kotlin","Programmer")

 //   println(StringArray.get(2))  // --> Instead of doing like this we can do something like
    println(StringArray[2])

    StringArray[2] = "Bhaii"
    println(StringArray[2])  //--> The value of the array at index 2 will get changed.

    println(StringArray.size) // -> this will give the size of the array

    /*
    // it will give indexOutOfBoundException, Arrays are immutable . We cannot change the size of the array
        StringArray[3] = "Abhii"
        println(StringArray[3])
     */

    println(Arrays.toString(StringArray)) // -> used to print the elements of the array

      val cont = arrayOf(1,2,3,4,5)
       println(Arrays.toString(cont))



}