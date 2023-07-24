fun sum(a: Int,b: Int): Int{
    val total = a+b
    return total
}

fun bagi(a:Int, b: Int): Int{
    if(b == 0){
        return 0
    }else{
        val result = a/b
        return result
    }
}

fun main() {
    val result = sum(10,5)
    println(result)

    println(sum(10,5))

    println(bagi(10,0))
}