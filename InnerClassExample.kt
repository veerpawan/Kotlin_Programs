class A{

     val name_outer="ABC"
   inner class B{
        val name="XYX"
        fun printName(){
            println("$name$name_outer")
        }
    }
}

fun main(){

    var objA=A()
    println(objA.name_outer)


    var objB=A().B()

    objB.printName()


}