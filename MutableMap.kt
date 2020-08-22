fun main() {

    var mutableMap = mutableMapOf(9 to "Aman", 11 to "Nikhil", 15 to "Rahul")

    mutableMap.put(1, "Praveen")

    mutableMap.put(4, "Abhi")
    for (item in mutableMap.keys) {
        println(mutableMap[item])
    }
}