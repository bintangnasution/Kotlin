fun String.hello():String= "Hello $this"

fun String.printHello():Unit = println("Hello $this")
fun main(){
    val name = "Bintang"
    println(name.hello())

    "Rinaldi".printHello()
}