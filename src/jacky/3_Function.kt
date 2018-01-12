package jacky

fun function(string: String = "good bye") {
    println(string)
}

fun main(args: Array<String>) {
    function()
    function("hello")
    function(string = "hello world")
}