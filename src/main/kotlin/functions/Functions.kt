fun  main() {

    iAmANewFunction()  // --> Invoking a function

}

 // fun IAmANewFunction() : Unit { --> When a function does not returns anything then by default
 //the return type will be unit . but that need not to be mentioned explicitly so we can
 // remove it

//     fun iAmANewFunction() {
//             println("I am your new function")
//
//        }

         fun iAmANewFunction() = println("I am your new function")