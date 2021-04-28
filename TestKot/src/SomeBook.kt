/*
1.Создайте класс книга, конструктор которого содержит параметры:
нзвание, год выпуска, цена
2. При создании объекта есть только одно обязательное поле - название, остальные поля по умолчанию null
3. После создания книги невозможно изменить ее название, остальные поля изменяемые
*/

// При такой инициализации будет доступ к Геттерам и Сеттерам
//class SomeBook (var name: String,var year: Int, var price: Double)

// При такой инициализации будет доступ только к Геттерам
//class SomeBook (val name: String,val year: Int, val price: Double)

// Создание конструктора без параметров (вторичный конструктор - secondary)
/*
class SomeBook (val name: String,val year: Int, val price: Double) {
     constructor(): this ("", 0, 00.0)
     }
*/
// Создание конструктора без параметров (первичный конструктор - primary)
class SomeBook (val name: String,var year: Int? = null, var price: Double? = null) {

}


fun main() {
    val book = SomeBook("Kotlin", 2021,1600.20)
    println(book.name)
 // book.name = "Java" //не проинициализируется Сеттер при val в конструкторе
    println(book.year)
    println(book.price)
    book.price = 1500.50
    println("цена снизилась до " + book.price)


}