package ErrorsAndExceptions

fun main() {
  //  Initialise a variable x = null and print the value as 0.0 while printing x using the
  //  Elvis operator.
    val x:Double? = null
    println(x ?: "0.0")
}