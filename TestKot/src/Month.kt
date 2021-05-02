
fun main() {
    val season = when (Month.APRIL) {
        Month.DECEMBER, Month.JANUARY, Month.FEBRUARY -> Seasons.WINTER
        Month.MARCH, Month.APRIL, Month.MAY -> Seasons.SPRING
        Month.JUNE, Month.JULY, Month.AUGUST -> Seasons.SUMMER
        Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> Seasons.AUTUMN
        }
    println(season)
    println(Month.APRIL.tempAverage)
}


enum class Month(val tempAverage: Int) {
    DECEMBER(-7), JANUARY(-14), FEBRUARY(-17), MARCH(-2), APRIL(3), MAY(10), JUNE(14),
    JULY(19), AUGUST(17), SEPTEMBER(13), OCTOBER(5), NOVEMBER(-1)
}
enum class Seasons {
    WINTER, SPRING, SUMMER, AUTUMN
}