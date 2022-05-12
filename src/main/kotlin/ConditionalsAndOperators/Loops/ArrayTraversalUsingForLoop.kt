package ConditionalsAndOperators.Loops

fun main() {

    val a = arrayOf("H","O","N","E","Y")
    for(i in 0..a.size-1) {
 //       println(a[i])
        println("${a[i]}")  // -> not actually required
    }

    for(element in a) {
               println(element)
    }

    for(i in 0 until a.size) {  // --> Until excludes the last entity
               println(a[i])

    }

}