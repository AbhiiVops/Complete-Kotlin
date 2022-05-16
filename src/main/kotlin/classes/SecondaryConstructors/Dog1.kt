package classes.SecondaryConstructors



class Dog1(var breed:String, var color: String,var age :Int) {

     // creating a class that has both primary and secondary constructors
      var name: String? = null

    constructor(breed:String,color: String ,age:Int,name:String) : this(breed,color,age) {
        // the above this is used to specify that these primary constructor variables
        // have been initialised and need to be initialised again
        this.name = name
    }
}

fun main() {

    val dog1 = Dog1("Labrador","Brown",3)
    val dog2 = Dog1("german Shepherd","Black",2,"Jerry")
}