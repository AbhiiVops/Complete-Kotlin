package Arrays

 fun main() {

    // Array of same data type

  val characterArray = arrayOf<Char>('a','b','c','d')
  // In val type of arrays we cannot replace the array with another array having the same size and same data type
  // but we can replace the individual elements


  var charArray = arrayOf('i', 'n', 't', 'e')

  // In var type of arrays we can replace the array with another array having the same size and same data type
  // as well replace the individual elements too

  charArray = characterArray

 // println(charArray.toCharArray()) // --> In this way we can directly print the array

  // In Kotlin once you declare an array you cannot change the size of the array



}