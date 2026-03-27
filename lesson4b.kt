fun main() {
    //below is a function that is able to add 2 numbers
    fun addition (){
        val number1 =10
        val number2 =20
        val sum = number1 +number2
        print("The sum of the numbers is : $sum")
    }
    addition()
    print("--------------------")

    //multiply 3 numbers
    fun multiply (){
        val number3 = 67
        val number4 = 12
        val number5 = 9
        val product = number3 * number4 *number5
        print("The product of the number is: $product")
    }
    multiply()
    print("--------------------")
    fun findsmallestlargest(num1:Int, num2:Int){
        if(num1 > num2){
            println("Largest: $num1")
            println("Smallest: $num2")
        }
        else if (num1<num2){
            println("Largest: $num2")
            println("Smallest: $num1")
        }
        else{
            println("Both numbers are equal : $num1")
        }
    }
    findsmallestlargest(37, 89)
    fun convertMinutes(totalMinutes:Int){
        val hours = totalMinutes/60
        val minutes = totalMinutes%60
        println("$totalMinutes minutes is equal to: $hours hours and $minutes minutes")
      }
      convertMinutes(179)
}