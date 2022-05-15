class Dog {

    // property
    var breed: String ="Labrador"
    var color:String = "Brown"
    var age:Int = 3

    // Member function(behaviour)
    fun eat(){
        println("${breed}s eat food")

    }

    fun bark() {
        println("${breed}s bark")
    }


}

fun main(){

     val dog1 = Dog() // creating an object of the class

       dog1.breed = "German Shepherd"
      dog1.color = "Black"
      dog1.age =1

      println("The breed of the dog is ${dog1.breed}, whose color is ${dog1.color}, whose age is ${dog1.age}")

      dog1.eat()  // invoking function with the object
    dog1.bark()
}