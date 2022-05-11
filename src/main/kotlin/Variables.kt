fun main() {

    var wholeNumber = 18   // --> Int data type
    var fractionalNumber = 3.5
    var sentence = "Abhii how r u?"
    var condition = false
    var char = 'A'
    var floatingNumbers = 34.5f

    // Explicitly mentioning the data type of the variable
    // Sometimes we need to initialise the variables only and not assign any value . At that time we use
    // this syntax to declare the variables
    var a: Int
    a= 6
    var str: String = "Training"

    val number = 2345
    val decimal = 5.9
    val name = "internshala"
    val conditions = true
    val character = 'S'
    val floatNumber = 382.4f


    wholeNumber += 19  //   --> since wholeNumber is of var type so we can reassign the value to it
   // number = 9  // --> since number is of val type so we cannot reassign a new value to it

    // wholeNumber = char + wholeNumber // --> this will give an error since the wholeNumber is of integer data
                                   // type so we can cannot add a character to it in a single program
                // This is what statically typed language means

    // Type inference -> Above  while the assigning values to variable we didn't mention the data type.
                            // kotlin interprets it by itself . This is known as type inference

    println(wholeNumber)

}