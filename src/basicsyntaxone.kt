fun main(args: Array<String>) {


    var personObj = Person()
    personObj.name = "Steve"

    println("The name of the person is : " + personObj.name)
    println("The name of the person is : ${personObj.name}") // String interpolation
    println("The name of the person is : $personObj.name")

}

class Person {

    var name: String = ""

    fun display() {
        print(name)
    }
}

