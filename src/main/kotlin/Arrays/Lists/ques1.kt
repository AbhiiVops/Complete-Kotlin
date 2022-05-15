package Arrays.Lists

fun main() {

    // Create an immutable list, a mutable list, and an arraylist of the elements: “Lionel Messi”,
    // “Wayne Rooney”, “Luka Modric”, “Eden Hazard”, “Sergio Aguero”. Print all the above three lists.

    val str  = listOf("Lionel Messi","Wayne Rooney","Luka modric","Eden Hazard","Sergio Aguero")
    println(str)

    val str1  = mutableListOf("Lionel Messi","Wayne Rooney","Luka modric","Eden Hazard","Sergio Aguero")
    println(str1)

    val str2  = arrayListOf("Lionel Messi","Wayne Rooney","Luka modric","Eden Hazard","Sergio Aguero")
    println(str2)
}