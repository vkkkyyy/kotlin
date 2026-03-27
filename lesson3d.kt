fun main() {
    //arrays
    //an array is a collection of items that are related in nature
    //to access an item of an array we use the index starting from index 0 
    //to create an array we use the arrayOf method/function

    val numbers = arrayOf(25,54,32,74,36,74,31)
    println(numbers.contentToString())

    //accessing items of an arrayby use od index
    println("Item on index 3 is :" + numbers[3])
}