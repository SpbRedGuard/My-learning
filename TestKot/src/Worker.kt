import java.util.*

/*
1. Создать класс Работник, конструктор которого содержит обязательные поля: имя, должность и год устройства на работу
2. Добавьте метод "работать", который выводит на экран строку "Работаю...".
3. Добавьте свойство "стаж", которые расчитывается, как "текущий год - год устройства на работу".
4. В файл Main создайте extension-функцию, которая выводит всю информацию о работнике
 */

class Worker (val name: String, val position: String, val startYear: Int) {
        val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    fun work(){
        println("Работаю")
    }

}

fun main() {
    val programmer = Worker ("Иван", "Программист", 2019)
    programmer.printInfo()
}

// extension-функция
fun Worker.printInfo() {
    println("Имя: $name, Должность: $position, Год устройства: $startYear, Стаж: $experience")
}