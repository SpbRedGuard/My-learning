/*
1. Создать data-class Адрес, конструктор которого содержит обязательные поля: название города, улицы и номера дома
2. В методе main создайте объект этого класса.
3. Создайте второй такой же объект используя метод copy
4. Выведите на экран значения этих объеков, их хэш-коды и результат сравнения объектов по equals().
5. Используя деструктор разложите объект на составляющие, сохранив значения в соответствующие переменные
6. Удалите ключевое слово data и реализуйте все необходимые методы, чтобы работа метода main() осталась прежней.
 */

/*data*/ class Address (private val cityName: String, private val streetName: String, private val houseNumber: Int) {
    operator fun component1 () = cityName
    operator fun component2 () = streetName
    operator fun component3 () = houseNumber

    fun copy(): Address {
        return Address(cityName, streetName, houseNumber)
    }
}

fun main() {
    val address = Address("Москва", "Дворцовая улица", 1)
    val address2 = address.copy()


    println(address)
    println(address2)
    if (address == address2) {
        println(true)}
    else {
        println(false)
    }
    println(address.hashCode())
    println(address2.hashCode())

// деструктор
    val (cityName, streetName, houseNumber) = address

    println(cityName)
    println(streetName)
    println(houseNumber)

}