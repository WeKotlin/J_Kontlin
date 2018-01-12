package jacky

class Clazz {
    var property = "property"
    fun function(string: String = "A"){
        println("function $string")
    }
}

var Clazz.newProperty : String
get() = property
set(value) {property = value}

fun main(args: Array<String>) {
    val instance = Clazz()
    instance.function()

    fun Clazz.functionB() = this.function("B")
    fun Clazz.functionC() = println("function C")
    instance.functionB()
    instance.functionC()

    instance.newProperty = "new property"
    println(instance.newProperty)
}