import java.lang.ArithmeticException

fun main() {


    val a: Int = 10
    val b: Int = 0
    var result: Int
    try {

        val aname = null

        println(aname)


        /*val arrayValue = IntArray(5)
        arrayValue.get(9)

        try {
            result = a / b
        } catch (ex: ArithmeticException) {
            println(ex.message)
        }*/


    } catch (e: ArrayIndexOutOfBoundsException) {
        println("array index out of bounds exception")
        println(e.message)
    } catch (e: Exception) {
        println("parent exception class")

    } finally {
        println("Finally")
    }


    /* */

}
