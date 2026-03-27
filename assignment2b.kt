fun main() {
    val points = -2000

    if (points < 0 && points <= 100){
        println("You do not qualify")
    }
    else if (points > 100 && points <=400){
        println("You win a smartphone")
    }
    else if (points > 400 && points <=1000){
        println("You win a laptop")
    }
    
    else {
        println("You win a trip to Canada")
    }      
    
}