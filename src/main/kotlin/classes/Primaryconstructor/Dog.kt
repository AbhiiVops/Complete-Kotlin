package classes.Primaryconstructor

/*//  class Dog constructor(breed :String,color: String,age: Int) { // --> we can define constructors using the constructor keyword

   class Dog(breed :String,color: String,age: Int) { // -> These are known as constructor variables

     // the below ones are known as member variable

    // the values which we give first gets stored in constructor variables which in turn
    // needs to be gets stored in member variables.



   // so we understood that constructor variables are equal to member variables
   // hence we need to equate these two ,but primary constructor cannot have a body so
   // we need to initialise a init block


      var breed : String
      var color : String
      var age : Int

      // so we now use init keyword with parentheses then :
      // use 'this' keyword
      // this keyword is used to differentiate b/w the constructor variable and member variable
      // this.memberVariables = constructor variables

      init {
          this.breed = breed // by convention names of constructor variables and member variables
                            // should be same.
         this.age = age
         this.color = color
      }

   // but there is repetition of same variables three times : so to reduce this
    // we can do smtng which has been done below and boiler plate code has been removed
   */

class Dog(var breed :String,var color: String,var age: Int) {

    fun eat(){
        println("${breed}s eat food")

    }

    fun bark() {
        println("${breed}s bark")
    }
}

fun main() {
   val dog1=  Dog("German Shepherd","Brown",3)
    dog1.eat()
    dog1.bark()

    val dog2 = Dog("labrador","Brown",1)
    dog2.eat()
    dog2.bark()
}