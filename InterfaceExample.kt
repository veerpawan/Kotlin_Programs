interface bike{

    var model:Int
    fun runSpeed()
}

interface parts{

    var tyre:Int
    fun engine()

}
class TVS:bike,parts{
    override var model: Int=2018
    override fun runSpeed() {
        println("220 KMPH")
    }

    override var tyre: Int=2018

    override fun engine() {
       println("TVS ENGINE")
    }


}
fun main(){
    var obj=TVS()

    obj.engine()
    obj.runSpeed()
    println(obj.tyre)

}
