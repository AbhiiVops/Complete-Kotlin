package interfaces


// Interface
class CallMe:MyInterface,NewInterface {  // this is how interface gets called

    override fun hello() {
        println("Function hello is called here")
    }

    override fun greeting() {
        println("New Greeting can be given here")
    }

    override fun newMethod() {
        println("Function of new Interface")
    }
}