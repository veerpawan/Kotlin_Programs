fun main(){

    val list= mutableListOf("Mango","Papaya","Watermelon","Orange","Kiwi")



    list.add(0,"Grapes")

    println(list.size)

    for(items in list){

        println(items)

    }

}