class RollNumber<T>(anyTypevalue: T) {
    var x = anyTypevalue

    /*init {
        println(x)
    }*/

    fun display() {
        println(x)
    }
}


fun main() {


    

    val obj = RollNumber(20)
    obj.display()

    val obj1 = RollNumber("ROLL_NUMBER_25025876874")
    obj1.display()


    val obj2 = RollNumber(true)
    obj2.display()


    //RollNumber(134567890).display()

}