fun main() {
// Найти среднюю из массива массивов чисел.map и average
    val revenueByWeek = listOf(
            listOf(10,3,7,1),
            listOf(8,6,9,4),
            listOf(12,7,4,8),
            listOf(10,1,5,7),
        )
    val total = mutableListOf<Int>()
    revenueByWeek.map {
        for (i in it) {
            total.add(i)
        }
    }
    val average = total.average()
    println(average)

// Найти среднюю из массива массивов чисел.flatmap/flatten - в таком варианте мы не создавали новую изменяемую коллекцию
    val total2 = revenueByWeek.flatten()
    val average2 = total2.average()
    println(average2)

// Создадим изменяемую коллекцию данных с информацией о пользователях

    //val data = mutableMapOf<String, List<Int>>()
    //data.put("file_1", listOf(15,19,33,51)) // - put подчеркивается, так как есть более короткий способ вставки данных
    //data["file_2"] = listOf(23,18,35,47) // - более короткий способ вставки данных
    //data.put("file_3", listOf(31,20,16,50))

// Создадим НЕ изменяемую коллекцию данных с информацией о пользователях
    val data = mapOf<String, List<Int>>(
          "file_1" to listOf(15,19,33,51),
          "file_2" to listOf(23,18,35,49),
          "file_3" to listOf(31,20,16,50)
    )
// подсчитать среднюю по листам из файла
    val average3 = data.flatMap { it.value }
    print(average3)

    val data2 = mapOf<String, List<Int>>(
            "file_4" to listOf(17,15,30,43),
            "file_5" to listOf(21,-19,32,47),
            "file_6" to listOf(30,24,13,41)
    )
    val average4 = data2.filter { it.value.all { it >=0}}.flatMap { it.value }.average()
    println(average4)


}