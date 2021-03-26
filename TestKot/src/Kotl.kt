
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

}






