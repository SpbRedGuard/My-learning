import java.util.*

/*
1. Создать класс Работник, конструктор которого содержит обязательные поля: имя, должность и год устройства на работу
2. Добавьте метод "работать", который выводит на экран строку "Работаю...".
3. Добавьте свойство "стаж", которые расчитывается, как "текущий год - год устройства на работу".
4. В файл Main создайте extension-функцию, которая выводит всю информацию о работнике

5. Создать класс Программист, который является наследником Работника. Этот класс содержит дополнительное поле "язык программирования". Метод work() будет вводить надпись "пишу код на (язык программирования)".
6. В методе main() создать коллекцию работников, в которой будут как обычные работники, так и программисты.
7. В цикле заставить всех работников работать
 */

open class Worker(val name: String, val age: Int, val startYear: Int=0, val position: String? = null) {
        val experience: Int
        get() = Calendar.getInstance().get(Calendar.YEAR) - startYear

    open fun work(){
        println("Работаю")
    }
}
class Programmer(name: String, age: Int, private val languageCode: String): Worker(name, age) {
    override fun work() {
        println("Пишу код на:$languageCode")
    }
}


fun main() {
    val programmer = Worker ("Иван", 25)
    programmer.printInfo()

    val workers = mutableListOf<Worker>()
    workers.add(Worker("Владимир", 32))
    workers.add(Worker("Сергей", 30))
    workers.add(Worker("Алексей", 29))
    workers.add(Programmer("Андрей", 34, "Kotlin"))
    workers.add(Programmer("Максим", 27, "JAVA"))

    for (worker in workers) {
        worker.work()

    }

}

// extension-функция
fun Worker.printInfo() {
    println("Имя: $name, Должность: $position, Год устройства: $startYear, Стаж: $experience")
}