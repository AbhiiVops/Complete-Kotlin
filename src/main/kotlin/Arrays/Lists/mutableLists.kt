package Arrays.Lists

fun main() {

    val listOfStrings = mutableListOf("Box","Table","Chair","Honeyy","Abhii","Dhruv","Chair")
    val subString = mutableListOf("Honeyyy","Abhii")
    listOfStrings[1] = "bed"
    listOfStrings.add("Babeyy")
    listOfStrings.add(4,"Babeyyyy")
    println(listOfStrings.size)
    listOfStrings.removeAt(2)

    val arr = arrayOf("Fan","lights","mattress")
    listOfStrings.addAll(arr)
    println(listOfStrings.get(3))
    println(listOfStrings.containsAll(subString))
    println(listOfStrings.remove("Box"))
    println(listOfStrings)
    listOfStrings.set(1,"dhruv")
    listOfStrings[1] = "dhruv"
    // the above two methods are same
    println(listOfStrings)
    listOfStrings.clear()
    println(listOfStrings)
    listOfStrings.contains("dhruv")
    listOfStrings.equals(subString)
    listOfStrings.isEmpty()
    listOfStrings.lastIndexOf("Honeyy")

    println(listOfStrings)


}