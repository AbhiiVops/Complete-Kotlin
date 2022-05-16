package classes.SecondaryConstructors

class Person(val firstName:String,val lastName: String) {
//    Create a class ‘Person’ with the properties ‘first name’ and ‘last name’.
//    Create a function ‘greeting’ and greet each created ‘Person’ object with the
//    message “Hello ‘first name’ ‘last name’, welcome to Internshala Trainings!”
     fun greeting() {

         println("Hello $firstName $lastName, Welcome to internshala trainings")
     }

}

fun main() {
    val person = Person("Arpita","Gupta")
    person.greeting()
}