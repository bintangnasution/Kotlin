infix fun String.to(type:String):String{
    if (type == "UP"){
        return this.toUpperCase()
    }else{
        return this.toLowerCase()
    }
}
fun main() {
    val result = "Bintang Nasution" to  "UP"
    println(result)
}