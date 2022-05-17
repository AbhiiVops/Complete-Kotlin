package Inheritance


// child class
class Cats(legs:Int,color:String):Animals(legs,color) {

//    fun purr() {
//        println("I purr")
//    }

    override fun sounds() = println("I purr")  // -> this method is overridden


}