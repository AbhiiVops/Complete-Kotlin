package ConditionalsAndOperators

fun main() {
    val a = arrayOf("Internshala", "Trainings")
    val b = arrayOf("Android", "App", "Developement")
    print(compareArrayLength(a, b))
}

// Create compareArrayLength() function here

fun compareArrayLength(a:Array<String>,b:Array<String>):Boolean{

    return a.size==b.size


}