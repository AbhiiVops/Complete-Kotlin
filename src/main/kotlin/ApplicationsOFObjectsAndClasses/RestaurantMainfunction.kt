package ApplicationsOFObjectsAndClasses

fun main() {

    val res1 = Restaurants("McD",4.7,200)
    val res2 = Restaurants("BurgerKing",4.6,250)
    var res3 = Restaurants("SugarKing",4.0,250)
    var res4 = Restaurants("H3 Cafe",4.4,150)
    var res5= Restaurants("Nanhe",5.0,50)
    var res6 = Restaurants("SugarKing",4.0,250)
    /*
     --> if we print this it will give its own value
     --> this is cuz machine use its own reference name to call objects but we want the actual
     data. so for that we will add the word 'data' in front the class and then print it.

     --> but in real life there will be so many objects in that case we cannot print like this
     --> so instead of doing like this we can run a loop.

     println(res1)
    println(res2)
    println(res3)
    println(res4)
    println(res5)

      for(i in 1.. ) --> if we run loop then we dont know upto where the iterator will go

    */

    val restaurantsList = mutableListOf(res1,res2,res3,res4,res5)
    // but this will print the whole values in one line and we dont want that
    // so for that we'll iterate through this list

    for(res in restaurantsList) {
        println(res)
    }

  // what is data class ?
    // data class is just like a regular class that holds some data
    // data classes help the compiler deal with the data inside objects and not just the objects


   /*  data classes can be use to compare data

   if(res3 == res6)
    println("same")
    else
    println("different")

     if we don't use the data classes then comparison operator would compare the objects
     rather than the data stored in the object that would give "different" as the answer.
      So as such data classes are very imp



  */
}

