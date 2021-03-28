fun main() {

    //создадим пустой массив на 101 элемент
    val array = arrayOfNulls<Int?>(101)
    // indices возвращает диапазон допустимых индексов для массива.
    for (i in array.indices) {
        array[i] = i
    }
    for (i in array)
        println(i)
    //downTo - позволяет проходить по массиву в обратном порядке, step позволяет выставить шаг прохождения по массиву
    for (i in 100 downTo 0 step 2)
        println(i)

    //Цикл for перебор по индексу, пример с умножением чисел из массива на 2
    for ((index,i) in array.withIndex()){
        array[index] = i?.times(2)
    }
    for (i in array){
        println(i)
    }
    // Создаём массив на 300 элементов
    val array2 = arrayOfNulls<Int?>(301)
    // Заполняем созданный массив элементами с числами от 300 до 600, используем индекс (index) и указываем диапазон.withIndex
    for ((index, i) in (300..600).withIndex()){
        array2[index] = i
    }
    // Распечатываем массив с конца в начало (downTo) с шагом (step) в 5
    for (i in array2.size-1 downTo 0 step 5){
        println(i)
    }
}