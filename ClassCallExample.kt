fun main() {


    var lampState = lamp()

    lampState.turnOff()
    lampState.turnOn()
    lampState.turnOff()
    lampState.turnOn()
    lampState.turnOff()
    //lampState.isOn

    //lampState.turnOn()


    println("Current State of Lamp is ${lampState.isOn}")

}

class lamp() {
    var isOn: Boolean = false
    fun turnOn() {
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }
}