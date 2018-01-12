package jacky

fun max(a : Int,b : Int ) : Int{
   return if (a > b) a else b
}

fun max2(a : Int,b : Int) = if (a > b) a else b

fun getUpperCase(str : Char) : Char = when {
    str == 'a' -> 'A'
    str == 'b' -> 'B'
    else -> str
}

fun getUpperCase2(str : Char) : Char = when(str) {
     'a' -> 'A'
     'b' -> 'B'
    else -> str
}

fun main(args: Array<String>) {
    println(max(1,2))
    println(getUpperCase('a'))
    println(getUpperCase2('b'))
}