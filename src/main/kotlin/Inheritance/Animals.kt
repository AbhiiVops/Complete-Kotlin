package Inheritance

// Parent class
open class Animals(var legs:Int,var color:String) { // --> open keyword for the reusability of the code


   fun eat () {
      println("I eat food")
   }

   fun sleep() {
      println("I sleep")
   }

   open fun sounds() {
      println("I make sounds")
   }
}