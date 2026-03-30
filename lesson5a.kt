class Person{
    //Attributes/ characteristics/ properties of a person
    var name = "Vicky"
    var age = 18
    var height = 5.2

    //Behaviours / actions / do-ables
    fun walk(){
        println("The person can walk")
    }
    fun speak(){
        println("The person can speak")
    }
    fun dance(){
        println("tje person can dance")
    }

}
fun main (){
    //objects is a real world thing
    //An object is intanciated from  class
    //for us to be able to either access the properties / behaviours of a class we require to have an object

    //below we create an object
    var myObject = Person()

    //below we use the dot separator to access either the function or the properties
    myObject.walk()
    myObject.speak()
    myObject.dance()
    println("the age of the person is " + myObject.age)
    println("the height of the person is "+ myObject.height)
}