fun main(args: Array<String>) {
    //function with parameters
    //parameters are inputs that get passed as arguments whrn invoking a function
    //NB:for parameters u must specify there data types
     fun greeting(name : String){
        println("Hello $name , hope you had a good day")
     }
     greeting("John")

     //below is an example of a function that is able to calculate the BMI of a person
     fun BMI(weight : Double , height :Double ){
        val answer = weight/(height*height)
        println("The BMI of the person is:"+answer)
     }
     BMI(67.2,1.62)

     //Create a function that accepts parameters and checks whether a given number is odd or even
     fun oddOreven(number :Int){
        if (number%2==0){
            println("$number is an Even number")
        }
        else {println("$number is an odd number")}
     }
     oddOreven(23)
}