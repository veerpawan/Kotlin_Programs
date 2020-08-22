class Teacher{

    fun teachMath(){

        println("I  can teach maths")
    }
    fun teachPhysic(){

        println("I can teach Physic")
    }



}



fun main(){

     fun Teacher.teachEnglish(){

        println("I am teach English ")
    }
    

    val objTeacher=Teacher()
    objTeacher.teachMath()
    objTeacher.teachPhysic()
    objTeacher.teachEnglish()
}