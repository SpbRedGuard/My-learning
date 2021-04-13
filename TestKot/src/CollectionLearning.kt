// Создать объект Map, в котором хранятся значения еженедельной выручки за разные месяцы.
// ключ - название месяца, значение - массив чисел (выручка за каждую неделю)

// в некоторых месяцах специально допустить ошибку (указать отрицательное значение выручки)
// Создать метод printInfo (data: Map<String, List<Int>), который создает отчет и выводит его в консоль.
// Отчет должен содержать:
// средняя выручка в месяц, максимальная и минимальная выручка
// названия месяцев на которые пришлись такая выручка
// использовать только корректные данные, исключить месяцы с отрицательной выручкой
// вывести названия месяцев в которых отрицательная выручка


fun main() {

    val data = mapOf(
            "Январь" to listOf(300, 400, 250, 500),
            "Февраль" to listOf(250, 600, 650, 400),
            "Март" to listOf(250, 600, 650, 400),
            "Апрель" to listOf(500, -600, 650, 450),
            "Май" to listOf(800, 300, 650, 680),
            "Июнь" to listOf(1000, 600, 700, 800),
            "Июль" to listOf(800, 670, 500, 550),
            "Август" to listOf(450, 750, -350, 550),
            "Сентябрь" to listOf(400, 270, 320, 550),
            "Октябрь" to listOf(350, 300, 250, 200),
            "Ноябрь" to listOf(250, 100, 200, 180),
            "Декабрь" to listOf(200, 150, 100, 50),
    )
    printInfo(data)
}

fun printInfo (data: Map<String, List<Int>>) {

    val validData = data.filterNot {it.value.any {it<0}}
    val averageWeek = validData.flatMap { it.value }.average()
    println("Средняя выручка в неделю: $averageWeek")

    val listOfSum = validData.map {it.value.sum()}
    val max = listOfSum.maxOrNull()
    val min = listOfSum.minOrNull()
    val averageMonth = listOfSum.average()

    val maxMonths = validData.filter {it.value.sum() == max }.keys
    val minMonths = validData.filter {it.value.sum() == min }.keys
    println("Средняя выручка в месяц: $averageMonth")
    println("Максимальная выручка в месяц: $max")
    print("Была в следующих месяцах: ")
    for (month in maxMonths){
        println("$month; ")
    }
    println("Минимальная выручка в месяц: $min")
    print("Была в следующих месяцах: ")
    for (month in minMonths){
        println("$month; ")
    }
    val invalidData = data.filter {it.value.any {it <0}}
    val errorMonths = invalidData.keys
    print("\nОшибки произошли в следующих месяцах: ")
    for (month in errorMonths) {
        print("$month; ")
    }

}