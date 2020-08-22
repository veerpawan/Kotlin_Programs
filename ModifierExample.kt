open class Base(){
   public var a=1
    private var b=2
    protected open var c=3
    internal val d=4

   open fun printllllln(){



    }
}

class Derived:Base(){
    override var c=10
     override fun printllllln(){

        println(c)

    }

}


fun main(){
   /* var base=Base()
    base.d*/

    var derive=Derived()
    derive.a
    //derive.






}






