package classes

class Laptop {

    //Create a class ‘Laptop’ with properties as RAM, brand and hard disk size.
    // Also, create a function ‘performComputations’ in it.
 //   For the class ‘Laptop’ created in the previous question, create two different
 //   objects in the main function.
    var ram: Int = 4
    var brand: String = "Dell"
    var hdd: Int = 512

    fun performComputations(){
        println("I perform computations")
    }

}

fun main() {
    val laptop = Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()

    val laptop1 = Laptop()
    laptop1.brand = "Lenevo"
    laptop1.hdd = 256
    laptop1.ram = 8
    println(laptop1.ram)
    println(laptop1.brand)
    println(laptop1.hdd)
    laptop1.performComputations()

    val laptop2 = Laptop()
    laptop2.brand = "HP"
    laptop2.hdd = 1024
    laptop2.ram = 16
    println(laptop2.ram)
    println(laptop2.brand)
    println(laptop2.hdd)
    laptop2.performComputations()
}