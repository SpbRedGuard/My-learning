
// Не локальная переменная (класс еще не создан)
var name: String? = "тест про"
val list: MutableList<Int>? = mutableListOf()

fun main() {
    // Если name будет null, то часть кода после .let не будет выполняться и приложение при этом не упадёт.
    // Если name будет >5
    name?.let {
        if (it.length > 5) {
            println("Тест прошёл")
        }
    }

    // Функция with
    val list = mutableListOf<Int>()
    with(list) {
        for (i in 0 until 1000) {
            add((Math.random() * 100).toInt())
        }
        println(sum())
        println(average())
        println(minOrNull())
        println(first())
        println(last())
    }

    // Объявить null коллекцию чисел вне метода main
    // Внутри метода main, используя функцию with(), заполнить её 1000 случайных чисел
    // Вывести на экран первые 100 четных чисел коллекции
    // При возникновении ошибок нуллабельности использоавать let

    list?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((Math.random() * 1000).toInt())
            }
            val result = filter { it % 2 == 0}.take (100)
            for (i in result) {
                println(i)
            }
        }
    }
}

