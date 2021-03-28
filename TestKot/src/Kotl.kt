
fun main () {
   val nameOfMonth = "Сентябрь"
   val season: String
    when (nameOfMonth) {
        "Декабрь", "Январь", "Февраль" -> {
            season = "Зима"
        }
        "Март", "Апрель", "Май" -> {
            season = "Весна"
        }
        "Июнь", "Июль", "Август" -> {
            season = "Лето"
        }
        "Сентябрь", "Октябрь", "Ноябрь" -> {
            season = "Осень"
        }
        else -> {
            season = "Не найдено"
        }
    }
    println(season)

    val time = 23
    val weatherIsGood = true
    val result = when {
        time in 6..22 && weatherIsGood -> {"Гулять"}
        time in 6..22 && !weatherIsGood -> {"Делать домашние дела"}
        else -> {"Спать"}
    }
    println(result)
}







