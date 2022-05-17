package InhertianceAndInterfacesCodingPractice

import InhertianceAndInterfacesCodingPractice.inheritance.*

fun main() {

    val bmw = Car1("BMW","White")
    bmw.Brand()
    bmw.speedUp()
    bmw.applyBrake()
    bmw.Colour()
    bmw.maxSpeed()

    var mer = car2("Mercedes Benz","Black")
    mer.Brand()
    mer.speedUp()
    mer.applyBrake()
    mer.Colour()
    mer.maxSpeed()
}