class checkNullablity {


    var name: String? = "Pawan"


    fun display() {
        //name=null
        println(name ?: "user did not enter their name")
    }


}

fun main() {

    var obj = checkNullablity()
    obj.display()

}