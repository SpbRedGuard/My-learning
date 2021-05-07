package anonymousClass

class Bicycle(name: String) : Transport(name) {
    override fun drive() {
        println("Велосипед едет...")
    }
}