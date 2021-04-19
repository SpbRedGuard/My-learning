// Создать класс (Собака), который содержит свйства: кличка, возраст, вес
// Переопределить геттер и сеттер так, чтобы :
// - возраст и вес нельзя было поставить меньше 0
// - при получении клички возвращается строка, начинается с заглавной буквы

fun main() {
    val book = Book("Kotlin", 2021,1000)
    println(book.nameBook)

}

class ObjOriented {
    var name = ""
        get() = field.toLowerCase().capitalize()

    var age = 0
        set(value) {
            if (value >= 0){
                field = value
            }
        }
    var weight = 0f
    set(value) {
        if (value >= 0) {
            field = value
        }
    }
}
// создать класс книга, конструктор которого содержит параметры: название, год выпуска,цену
// при зоздании объекта есть только одно обязатедбное поле - название, остальные по умолчанию null
// после создания книги невозможно изменить название, остальные поля изменяемые
class  Book (val nameBook: String, var year: Int? = null, var price: Int? = null) {

}
