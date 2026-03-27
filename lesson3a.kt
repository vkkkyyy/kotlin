fun main() {
    //For loops
    for(counter in 1..30){
        println("counter id $counter")
    }

    println("==============")
    for(number in 50..65){
        println("all number $number ")
    }
    println("==============")
    //reserch on how to incrament on the for loop by use of steps
    for (x in 20..40 ){
        if(x %2 != 0){
            println("$x is ODD")
        }
    }

    //by use of a for loop , generate the multiplication table for 5 from 1 to 5
    val tableof =5
    println("Multiplication table of $tableof :")
    for (i in 1..5){
        val result = tableof * i
        println("$tableof x $i = $result")
    }

    //create a program that is able to find the factorial of number 5
    val num=5
    var factorial = 1
    for(i in 1..num){//i
        factorial *=i
    }
    println("The factorial of $num is $factorial")
    
}



