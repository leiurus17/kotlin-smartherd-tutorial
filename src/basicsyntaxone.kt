fun main(args: Array<String>) {

    var name: String
    name = "Itachi"

    var personObj = Person()
    personObj.display(name)
}

class Person {
    fun display(name: String) {
        print(name)
    }
}

