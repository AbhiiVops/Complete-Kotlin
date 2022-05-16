package classes.SecondaryConstructors

class Dog2(var breed:String, var color: String) {

// Write the program shown in the previous video and create a secondary
// constructor and add the property ‘height’ along with ‘age’. Also create its object.

    var height: Int? = null
    var age: Int? = null

    // creating secondary constructor
    constructor(breed:String,color:String,height:Int,age:Int) : this(breed,color){

        this.height = height
        this.age = age

    }


}

fun main() {

    val dog11 = Dog2("Labrador","golden",90,2)
    val dog22 = Dog2("pomerian","white")

}