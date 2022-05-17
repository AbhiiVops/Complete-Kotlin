package InhertianceAndInterfacesCodingPractice.inheritance

open class Car(var brandName:String,var colour:String) {

    // Create a parent class Car and functions speedUp() and applyBrake().
// Now create two different child classes inheriting class Car. Also, create
// objects for both of the child classes and use the functions that were
// created inside the parent class.

    fun speedUp() {
        println("I speed up")
    }

    fun applyBrake() {
        println("I apply brake")
    }

    open fun Brand() {
        println("I am a brand")
    }

    open fun Colour() {
      println("the color is")
    }

    open fun maxSpeed() {

    }


}