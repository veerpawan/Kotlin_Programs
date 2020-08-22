fun main(){

    var number=4

    var factorial=1
    do {
        factorial *= number
        number--
    }while (number>0)
    println(factorial)
}