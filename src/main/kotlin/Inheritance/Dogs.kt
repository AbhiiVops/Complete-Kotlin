package Inheritance

// we can add more properties here directly without using the var and val keyword
// SubClass
class Dogs(legs:Int,color:String):Animals(legs,color) {

//    fun bark() {
//        println("I bark")
//    }

  override fun sounds() {  //  // -> this method is overridden
        println("I bark")
    }
}