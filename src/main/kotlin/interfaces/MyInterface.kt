package interfaces

// since Interfaces don't have any constructors so no parentheses required
interface MyInterface {

    // Inside the interface we may or may not have a function body of the declared functions.

    fun hello()  // function without any implementation

    fun greeting()  = println("Hello there") // -> function with default implementation

}

// Let's talk about inheritance and interfaces
// In interfaces we don't call it inheritance we call it 'implementation'
// this is just to avoid confusion.the basics things remains same



