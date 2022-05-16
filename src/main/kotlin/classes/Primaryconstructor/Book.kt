package classes.Primaryconstructor

class Book(var bookName:String,var genre:String,var publisher:String) {
  // Create a class named ‘Book’ with properties as ‘book name’, ‘genre’ and
// ‘publisher’ in the primary constructor and create its objects in the main function.

    fun BookSpecification() {
        println("The name of the book is : $bookName whose genres are : $genre whose publisher is $publisher")
    }
}

fun main() {

    val book1 = Book("The subtle art of not giving a F**k","motivational","Mark manson")
    book1.BookSpecification()


}