package Arrays.Lists

fun main() {

    val listOfStrings = listOf("Box","Table","Chair","Honeyy","Abhii","Dhruv","Chair")  // -> immutable lists
    val str = listOf("Abhii","honeyy")
    val str1 = listOf<Any>()
  //  listOfStrings[1] = "Bed" // --> we cant add a element like this in list

    // we can retrieve any data from the list but we cannot alter anything since it is a immutable list

    println(listOfStrings.size)
    println(listOfStrings.toString())
    println(listOfStrings.get(2))
    println(listOfStrings[2])
    println(listOfStrings.indexOf("Chair")) // -> if the element exists it will show the index or it will show -1
    println(listOfStrings.subList(1,2)) // -> includes the fromIndex and excludes the toIndex
    println(listOfStrings.lastIndexOf("Chair"))
    println(listOfStrings.equals(str))
    println(listOfStrings== str)  // the upper one and this are same
    println(listOfStrings.contains("Abhii"))
    println(str1.isEmpty())
    println(listOfStrings.containsAll(str))


}