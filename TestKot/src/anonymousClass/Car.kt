package anonymousClass

class Car(override var name: String) : Transport(name) {
    override fun drive() {
        println("Машина едет...")
    }
    fun startEngine (): Boolean {
        println("Запускаю двигатель")
        return true
    }
}