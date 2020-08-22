
fun main() {


    var immutableMap = mapOf(9 to "Kent",8 to "Nikhil",7 to "Rahul", 9 to "John",8 to "Charls", 10 to "Vaibhav",8 to "Aman")


    for(value in immutableMap.keys){

        println(immutableMap[value])

    }


    // gives compile time error
    // immutableMap.put(9,"Praveen")

}