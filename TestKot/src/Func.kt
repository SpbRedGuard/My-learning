import kotlin.math.min

fun main() {
    println(max(3,6))
    println(crop("Несколько букв"))
    println(sum(4,2,5,32,5))
// Можно изменять параметры на вход numbers, так как создан перегруженный метод sort
    val numbers = mutableListOf(5,3,42,4,-1,2,7,9,12)
// Можно изменять параметры на вход sort
    //val result = sort(numbers)
    for (i in numbers) {
        println(i)
    }
}

fun max (a: Int, b: Int): Int {
    return if (a>b) {
        a
    }  else {
        b
    }

}
// Функция на вход получает строку, а возвращает указанное число символов
fun crop(str: String) = str.substring(0, min(9, str.length))

fun sum (vararg numbers: Int): Int {
    var result = 0
    for (num in numbers) {
        result += num
    }
    return result
}

// Создать метод sort, который возвращает коллекцию чсел в остортированном виде
// Тип возвращаемой коллекции должен быть не изменямый (List)
// В качестве параметра массив может принимать коллекцию, массив или аргументы переменной длины
// Если передаваемая коллекция содержит одинаковые элементы, то они должны сохраниться

fun sort (numbers: MutableList<Int>) : List<Int> {
    for(i in 1 until numbers.size) {
        for(j in numbers.size - 1 downTo i) {
            if (numbers [j] < numbers[j-1]){
                val temp = numbers[j]
                numbers [j] = numbers[j-1]
                numbers[j-1] = temp
            }
        }
    }
    return numbers
}

//fun sort (numbers: Array<Int>) = sort(numbers.toMutableList())
//fun sort (vararg numbers: Int) = sort(numbers.toMutableList())