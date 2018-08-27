fun main(args: Array<String>) {


    var personObj = Person()
    personObj.name = "Steve"
    personObj.display(personObj.name)
}

class Person {

    var name: String = ""

    fun display(name: String) {
        print(name)
    }
}

