
val lambda={ println("In Lambda")}


fun showLambda(lmbd:()->Unit){
lmbd()
}
fun main(){
    //showLambda(lambda)


    val product={a:Int,b:Int->a+b}

    println(product(10,5))
}


