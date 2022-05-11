package Arrays
import java.util.*


fun main() {

    val newArr: Any = arrayOf("hello",12,'a',12.34,true) //--> We have explicitly declared the type of the array . As such it is not required
    val newArr1 = arrayOf("hello",12,'a',12.34,true)

    println(Arrays.toString(newArr1))

}