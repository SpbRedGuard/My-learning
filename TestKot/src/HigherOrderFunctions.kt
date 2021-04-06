import java.util.*

//Функции высшего порядка filter и map

fun main() {

// Коллекция чисел от 0 до 100
    val listOfNumbers  = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }

// Метод .filter

// Хотим получить новый массив с содержанием только четных чисел первого массива с помощью функции filter
    val listOfEvenNumbers = listOfNumbers.filter { it % 2 == 0 }
    for (i in listOfEvenNumbers)
        println(i)

// Создать коллекцию имен
// Из первой коллекции оставить только те имена, которые начинаются с буквы "Е" и добавить их в новую коллекцию

    val names = listOf("Александр", "Мария", "Ирина", "Виктор", "Максим", "Алексей", "Роман", "Борис", "Михаил", "Маргарита", "Елена", "Екатерина", "Евгений", "Сергей")
    val namesStartsFromA = names.filter {it.startsWith("Е")}
    for (name in namesStartsFromA) {
        println(name)
    }

// Метод работы с коллекциями .map

// Создадим коллекцию чисел

    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map {it * 2}
    for (i in doubledNumbers)
    println(i)

// Преобразование коллекции чисел в массив строк
    val num = (0..100).toList()
    val employees = num.map { "Employee № $it"}
    for (employee in employees)
        println(employee)
// Делаем массив сортированных элементов в порядке возрастания

    val arrayA = arrayOf(8, 7, 6, 12, -1, 0, 2, 4)
    val sortedArrayA = arrayA.sorted()
    for (i in sortedArrayA)
        println(i)
// Делаем массив сортированных элементов в порядке убавания
    val array = arrayOf(8, 7, 6, 12, -1, 0, 2, 4)
    val sortedArrayB = array.sortedDescending()
        for (i in sortedArrayB)
            println(i)
// Создать коллекцию случайных чисел от 0 до 1000 размером 1000 элементов
// Оставить только те числа, которые без остатка делятся на 7 и 4
// Каждое число из полученной коллекции возвести в квадрат
// Полученную коллекцию отсортировать по убыванию
// Преобразовать в коллекцию элементов типа String

    val initArray = mutableListOf<Int>()
    for (i in 0 until 1000) {
        initArray.add((Math.random() * 1000).toInt()) //Подаём случайные числа приведённые к формату Int
    }
    val result = initArray.filter {it % 7 ==0 || it % 4 == 0}.map {it *it}.sortedDescending().map {"$it"}
    for (i in result)
        println(i)
}