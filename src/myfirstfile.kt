/**
 * This is the main function. Entry point of the application
 * Unit means no return value. Void method.
 *
 */
fun main(args: Array<String>) : Unit { // This is an inline comment...
    var myString = "Hello World"
    var myNumber = 10           // Int
    var myDecimcal = 1.0        // Decimal

    var myAnotherString: String // String
    myAnotherString = "Hello Kotlin"

    val myFinalString = "My Constant String Value" // val means final. Immutable.

    println(myString)
    println(myNumber)
    println(myDecimcal)
    println(myAnotherString)
    println(myFinalString)
}