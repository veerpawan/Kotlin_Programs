abstract class bank(){

    abstract fun simpleInterest(p: Int, r: Double, t: Int):Double

}

class SBI:bank(){
    override fun simpleInterest(p: Int, r: Double, t: Int) :Double{


        println(p * r * t / 100)
        return p * r * t / 100
    }
}
class PNB: bank(){
        override fun simpleInterest(p: Int, r: Double, t: Int):Double {
            println(p * r * t / 100)
            return p * r * t / 100
        }

    }

fun main(){

    var objSbi=SBI()
    var resultOfSbi=objSbi.simpleInterest(1000,5.0,2)
    var objPnb=PNB()
    var resultOfPnb=objPnb.simpleInterest(1000,4.0,2)

    println("ENDOFSBI"+resultOfSbi)
    println("ENDOFPNB"+resultOfPnb)

}



