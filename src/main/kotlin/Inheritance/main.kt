package Inheritance


fun main() {

    val dog1 = Dogs(4,"Brown")
    // method of derived class
  //  dog1.bark()
    // We are able to call the functions of the Animals which is our parent class
    dog1.sleep()
    dog1.eat()
    dog1.sounds()

    val cat1 = Cats(4,"White")
  //  cat1.purr()
    cat1.sleep()
    cat1.eat()
    cat1.sounds()



}