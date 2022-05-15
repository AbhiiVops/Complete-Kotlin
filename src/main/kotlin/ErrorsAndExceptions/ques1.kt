package ErrorsAndExceptions

/*  Print the value present at index 6 in the given array.
arr = [0, 100, 200, 300, 400, 500].
Use try-catch to catch the exception if any.     */

fun main(){

    // write your code here
    val a = arrayOf(0,100,200,300,400,500)

    try{
        println(a[6])
    }
    catch(e: Exception) {
        println("I ran and caught the exception") //--> writing this message is optional
    }
    println(a.contentToString())


}
