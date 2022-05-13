package Arrays.Lists

fun main() {

    val listOfStrings = mutableListOf("Box","Table","Chair","Honeyy","Abhii","Dhruv","Chair")
    listOfStrings[1] = "bed"
    listOfStrings.add("Babeyy")
    listOfStrings.add(4,"Babeyyyy")
    println(listOfStrings.size)
    listOfStrings.removeAt(2)

    val arr = arrayOf("Fan","lights","mattress")
    listOfStrings.addAll(arr)
    println(listOfStrings)



}