fun main() {

    // Создать 2 коллекции, мена и номера телефонов. Объединить две коллекции в одно с помощью функции ZIP

    val names = mutableListOf<String>()
    val phones = mutableListOf<Long>()
    for (i in 0..1000) {
        names.add("Имя$i")
        phones.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users = names.zip(phones)
    for (user in users) {
        println("Имя ${user.first} Телефон ${user.second}")
    }
 // Создать массив строк и заполнить значениями Имя и Фамилия
 // Создать коллекцию объектов Pair, в которых first - Фаилия, second - Имя
    val fullNames = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Имя $i Фамилия $i")
    }
    val names2 =fullNames.map {it.substringBefore(" ") }
    val lastNames = fullNames.map {it.substringAfter(" ")}
    //for (lastName in lastNames) {
    //    println(lastName)
    //}
    val users2 = names2.zip(lastNames)
    for (user2 in users2){
        println("Имя: ${user2.first} Фамилия: ${user2.second}")
    }
// Алтернативный вариант
    val fullNames2 = mutableListOf<String>()
    for (i in 0..1000) {
        fullNames.add("Имя $i Фамилия $i")
    }

    val users3 = fullNames2.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }
    for (user3 in users3){
        println("Имя: ${user3.first} Фамилия: ${user3.second}")
    }
}