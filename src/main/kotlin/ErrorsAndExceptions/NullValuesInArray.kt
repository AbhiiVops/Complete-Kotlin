package ErrorsAndExceptions

fun main() {

    val  nullList = listOf(2,3,null,4,5,6)

    val nullArrayList = arrayListOf("This",null,"is","a",null,"statement")
    println("The list without the null value is ${nullList.filterNotNull()}")   // this will print the array without the null values
    println("The list without the null value is ${nullArrayList.filterNotNull()}")

}