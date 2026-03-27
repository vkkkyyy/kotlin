//1. Using if statements or when statement, create a program to find if given year is leap or not 
fun main() {
    val year = 2026
    
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) println("$year is a Leap Year")
            else println("$year is not a Leap Year")
        } else {
            println("$year is a Leap Year")
        }
    } else {
        println("$year is not a Leap Year")
    }
}


//2. Using if statements check if a given number is ODD or Even

fun main() {
    val number = 7

    if (number % 2 == 0) {
        println("$number is EVEN")
    } else {
        println("$number is ODD")
    }
}


// // Research on the looping structures in kotlin, how to create an array in kotlin