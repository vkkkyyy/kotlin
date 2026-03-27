//when Statement
// The when statement in Kotlin is like a switch case in other languages. 
//It checks a value against multiple conditions and executes the matching block.

fun main() {
    val marks = 7
    when (marks){
        in 1..30-> println("You failed")
        in 31..50->println("You are Average")
        in 51..70->println("You're above average")
        in 71..100->print("You passed")
        else->println("Invalid score...")
    }
    
}