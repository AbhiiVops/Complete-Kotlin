package Arrays
import java.util.*
fun main(){

    // Create two arrays, one with the first 5 even numbers and another with first 5 odd numbers and
    //add each element of the first array with every corresponding element of the second array.




        // Write your code here
        val arr1 = arrayOf(2,4,6,8,10)
        val arr2 = arrayOf(1,3,5,7,9)
        val result = arrayOf(arr1[0]+arr2[0],arr1[1]+arr2[1],arr1[2]+arr2[2],arr1[3]+arr2[3],arr1[4]+arr2[4])
        println(Arrays.toString(result))
    }
