package InhertianceAndInterfacesCodingPractice.inheritance

import InhertianceAndInterfacesCodingPractice.inheritance.*

class Car1(brandName:String,color:String): Car(brandName, color) {

//    override fun Brand() {
//
//        println("I am a BMW")
//    }

    override fun Brand() {
        println("The brand of the car is $brandName")
    }

    override fun Colour() {
        println("The color of the car is $colour")
    }

    override fun maxSpeed() {
        println("it can go upto 314kmph")
    }

}