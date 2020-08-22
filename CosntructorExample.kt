 class MathematicsOperation(val number1:Int, val number2:Int){
     fun sum(){
        println(number1+number2)
    }

     fun division(){
         println(number1/number2)

     }
     fun multilication(){
         println(number1*number2)

     }
     fun minuss(){

         println(number1-number2)
     }

}

fun main(){

    var obj=MathematicsOperation(5,8)
    obj.sum()
    obj.minuss()
    obj.multilication()
    obj.division()
}