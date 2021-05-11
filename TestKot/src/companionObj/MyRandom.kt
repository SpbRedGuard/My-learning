package companionObj

/*
Создайте класс MyRandom, в котором будут следующие статические методы:
1) Возвращет случайное число в переданном диапазоне
2) Возвращает случайное значние типа boolean (true или false)
3) Возвращает случайный день недели (название)
 */
class MyRandom {
    companion object {
        private const val MONDAY = "Понедельник"
        private const val TUESDAY = "Вторник"
        private const val WEDNESDAY = "Среда"
        private const val THURSDAY = "Четверг"
        private const val FRIDAY = "Пятница"
        private const val SATURDAY = "Суббота"
        private const val SUNDAY = "Воскресенье"

        fun randomInt (from: Int, to: Int) = (Math.random() * (to - from + 1)).toInt() + from
        fun randomBoolean () = randomInt(0,1) > 0
        fun randomDayOfWeek() : String {
            return when (randomInt(1,7)) {
                1 -> MONDAY
                2 -> TUESDAY
                3 -> WEDNESDAY
                4 -> THURSDAY
                5 -> FRIDAY
                6 -> SATURDAY
                else -> SUNDAY
            }
        }
    }
}