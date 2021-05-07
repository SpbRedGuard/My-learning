package anonymousClass

fun main() {
/*    val car: Transport = Car("Машина")
    val bicycle: Transport = Bicycle("Велосипед")
    if (car !is Car) return
    car.name = "Машина2"
    println(car.name)
*/

    // Анонимный класс создаётся внутри метода
    travel(object : Transport("Автобус") {
        override fun drive() {
            println("Автобус едет..")       }

    })

}
fun travel (transport: Transport) {
    transport.drive()
}