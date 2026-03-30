//inheritance is whereby a child class obtains the properties n behaviours of another class(parent class)
open class Animal {
    //properties
    var name = "Name"

    //behaviour of the dog
    fun walk (){
        println("the animal can walk")
    }
    fun sleep (){
        println("the animal can sleep")
    }
}
//below class inherits from the parent animal
class Dog : Animal(){
    fun bark (){
        println("the dog likes barking..")
    }
}
fun main(){
    //create an object
    var myDog =  Dog()

    //accessing the behaviour of a dog
    myDog.bark()
    myDog.sleep()
    myDog.walk()
}