class Circle {
    var radius = 7
    var pie = 3.142

    fun circleArea() {
        val areaOfCircle = pie * radius * radius
        println("The area of the circle is $areaOfCircle")
    }
    fun circumfrence(){
        val circlePerimeter = 2 * pie * radius
        println("the circumfrence of the circle is &circlePerimeter")
    }
} 

class Rectangle {
    var length = 10
    var width = 5

    fun area() {
        val areaRectangle = length * width
        println("The rectangle area is $areaRectangle")
    }
    
    fun perimeter() {
        val perimeterRectangle = 2 * (length + width)
        println("The perimeter is $perimeterRectangle")
    }
} 

fun main() {
    val myCircle = Circle()
    myCircle.circleArea()
    myCircle.circumfrence()

    val myRectangle = Rectangle() 
    myRectangle.area()
    myRectangle.perimeter()
}

