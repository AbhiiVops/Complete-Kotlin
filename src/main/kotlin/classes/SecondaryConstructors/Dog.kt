package classes.SecondaryConstructors

class Dog {

    // Creating a class which has only secondary constructors
    var breed : String
    var color : String
    var age : Int


    constructor(breed: String,color: String,age:Int){

        // this.memberVariables = constructorVariables
        this.breed = breed
        this.color = color
        this.age = age
    }
}