package ApplicationsOfObjectsAndClasses

// Create your class here
data class Student(var name:String,var rollno:Int,var percentageMarks:Double) {
  // Store a list of ten students in a mutable list. Each student entry should have a name,
    // roll number, and percentage marks. Make functions inside the class Student to
    // print the values of each student in a separate line and then make Student class
    // as data class and directly print the values.

    fun studentInfo(){
        println("Name of the student : $name")
        println("Roll no. of the student : $rollno")
        println("Percentage Marks obtained : $percentageMarks")
    }
}


fun main() {
    // write your code here
    val stu1 = Student("Arpita Gupta",15,92.08)
    val stu2 = Student("Rishabh singh",44,88.7)
    val stu3 = Student("Aditya narayan tiwari",3,91.8)
    val stu4 = Student("Dhruv adavadkar",22,87.2)
    val stu5 = Student("Abhishek bhattacharjee",62,94.4)

    val studentDetails = mutableListOf(stu1,stu2,stu3,stu4,stu5)
    for(stu in studentDetails) {
        println(stu)
    }

}