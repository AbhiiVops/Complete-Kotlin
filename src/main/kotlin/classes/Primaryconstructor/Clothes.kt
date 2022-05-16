package classes.Primaryconstructor

class Clothes(var material:String,var colour: String,var price:Int) {
    // Create class 'Clothes' with ‘material’, ‘colour’, and ‘price’
// as properties in primary constructor and create its objects
// in the main function.
    fun specification() {
        println("The quality of the material is $material")
        println("the colour of the cloth material is $colour")
        println("The price of the cloth is $price")
    }

}

fun main() {

    val cloth1 = Clothes("nylon","Black",700)
    cloth1.specification()

    val cloth2 =Clothes("Cotton","Yellow",900)
    cloth2.specification()
}