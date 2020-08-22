class MyClass {
    companion object {
        // member function of companion object
        fun display(str: String): String {
            return str
        }
    }
}

// extension function of companion object
fun MyClass.Companion.abc() {
    println("Extension function of companion object")
}

fun main(args: Array<String>) {
    val ob = MyClass.display("Function declared in companion object")
    println(ob)
    // invoking the extension function
    val ob2 = MyClass.abc()
}