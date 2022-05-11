package Arrays
import java.util.*

fun main(){

    // Create a function in Kotlin which has a string and an array which contains the index of
// all the vowels present in that string. Print the array, and then calculate the sum of all
// the values of the array. Use the string: “I am a Kotlin programmer now”.

    println(kot())

}

fun kot():Int {

    val str = "I am a Kotlin Programmer now"
    val myArray = arrayOf(0, 2, 5, 8, 11,16,19,22,26)

    println(Arrays.toString(myArray))

    val sum = myArray[0]+myArray[1]+myArray[2]+myArray[3]+myArray[4]+myArray[5]+myArray[6]+myArray[7]+myArray[8]

    return sum

}
