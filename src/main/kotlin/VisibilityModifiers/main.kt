package VisibilityModifiers

fun main() {

    val c = sum(10,20)
 //   val d = diff(20,10)  --> Since diff is a private function and it can be only accessed in the
                             // same file where it is declared

    val e = division(20,10)

    val p = Product()
 //   p.product(10,20)

}

class Product {

    protected fun product(a:Int,b:Int) = a*b
}