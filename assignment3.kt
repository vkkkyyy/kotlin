fun main() {
    // create assignment3.kt and by use of for loop, create an array of 7 counties and loop through them.    
    val counties = arrayOf("Nairobi" , "Kiambu" , "Murang'a","Embu","Mombasa","Kitale","Mali")
    println("List of counties:")
    for(county in counties){
        if(county=="Nairobi"|| county=="Murang'a")//we use OR(||) to check each item one at a time .
        print("$county ")
    }

    println("========================")
//Assignment 1. Create a For loop to print year from 2000 to 2025 
for(year in 2000..2025){
    println(year)
}

println("========================")
//2. Create a For loop to print from 100 to 1
  for(i in 100 downTo 1){
    println(i)
  }

  println("========================")
//Assignment 1. Create a while loop to print from -20 to +20 
var number =-20
while(number<=20){
    println(number)
    number++
}
println("========================")
//2. Create a while loop to print all EVEN years from 2000 to 2025.
var year = 2000 ;
while(year <= 2025){
    println("year")
    year += 2
}
sayHello()
}

// research on function without parameters in kotlin
//Is a function that does not require any input data to perform its task.
fun sayHello(){
    println("Hello from Kenya!")
    }
   