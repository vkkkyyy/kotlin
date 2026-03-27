fun main(args: Array<String>) {
    print("Hello there. Kotlin Works.")
    
    val num = 5
    var factorial: Long = 1
    
    for (i in 1..num) {
        factorial *= i
    }
    println("Factorial of $num is $factorial")
}

