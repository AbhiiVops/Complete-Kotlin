package ErrorsAndExceptions

fun main() {

    // An example of an exception
    // while writing it will not give an error but while running it will throw an exception :
    // ArrayIndexOutOfBoundException
     val arr = arrayOf(1,2,3,4)
       println(arr[2])
      arr[4]= 9
     println(arr[4])



}