abstract class Car {

    abstract fun run()
}

class Honda : Car() {
    override fun run() {
        println("I am in honda")
    }
}

class Maruti : Car() {
    override fun run() {
        println("I am in Maruti")
    }

}

fun main(){

    var objHonda=Honda()
    objHonda.run()

    var objmaruti=Maruti()
    objmaruti.run()

}










