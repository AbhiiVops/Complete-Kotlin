package ErrorsAndExceptions

fun main(){

    // Initialise a String as “Hello, Kotlin” and change its value to null. Now print the length of the
    // String using safe call and non-null assertion operator.
    var str:String? = "Hello ,Kotlin"
    str = null

    println(str?.length)
    // println(str!!.length)



}