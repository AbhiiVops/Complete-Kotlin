package Arrays.Lists

fun main() {

   // In the mutable version of the list in the previous question add the string: “Harry Kane”.
// From the modified list remove the string: “Wayne Rooney”. Now in this list add the string:
// “Neymar Jr.” at index 1. Now print the modified mutable list.

    val str1  = mutableListOf("Lionel Messi","Wayne Rooney","Luka modric","Eden Hazard","Sergio Aguero")
    str1.add("Harry Kane")
    str1.remove("Wayne Rooney")
    println(str1)
}