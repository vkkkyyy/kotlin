;fun main() {
    //create a function that accepts parameter that is able to do convertion of degree celsius into fahrenheit
    fun celsiusToFahrenheit(celsius:Double): Double{
        return (celsius * 1.8)+32
    }
    val fahrenheit = celsiusToFahrenheit(16.2)
    println(fahrenheit)
    println("_________________")


// create a function that is able to calculate the compound interest of a person
fun compound(p: Double, r: Double, t: Double, n: Int) = p * Math.pow(1 + r/n, n * t)
// Instead of using curly braces { } and a return keyword, the = tells Kotlin: "The result of this function is whatever this math equation produces."
val result = compound(8900.0 , 0.05 , 10.5 , 12)
val formattedResult = "%.2f".format(result)
println("$formattedResult")
//"%.2f": This is a special "template."
//% starts the command.
//.2 specifies two digits after the decimal.
//f stands for "floating-point number" (a decimal).
  println("_________________")








}
