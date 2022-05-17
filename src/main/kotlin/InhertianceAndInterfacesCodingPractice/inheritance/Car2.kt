package InhertianceAndInterfacesCodingPractice.inheritance

import InhertianceAndInterfacesCodingPractice.inheritance.*

class car2(brandName:String,color:String): Car(brandName, color) {


//    override fun Brand() {
//
//        println("I am Mercedes Benz")
//    }

    override fun Brand() {
        println("The brand of the car is $brandName")
    }

    override fun Colour() {
        println("The color of the car is $colour")
    }

    override fun maxSpeed() {
        println("it can go upto 200kmph")
    }
}