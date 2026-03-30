//research on inheritance and give examples of a program
//In programming, inheritance is a mechanism where one class (the child) takes on the properties and behaviors (fields and methods) of another class (the parent). 

//KEY RULES IN KOTLIN
//open keyword: By default, Kotlin classes are "final" (closed). You must mark a class as open to allow others to inherit from it.
//: operator: Used to indicate which class is being inherited.
//override keyword: Required when a child class redefines a method from the parent. 

// 1. Parent Class (The General Group)
// We use 'open' so other classes CAN inherit from it
open class Animal {
    fun eat() {
        println("This animal is eating.")
    }
}

// 2. Child Class (The Specific Group)
// The ':' means Dog "is an" Animal
class Dog : Animal() {
    fun bark() {
        println("The dog says: Woof!")
    }
}
     val myDog = Dog()

  
    fun main() {
        myDog.eat()  // This comes from the Parent (Animal)
        myDog.bark() // This is unique to the Child (Dog)
}
  
