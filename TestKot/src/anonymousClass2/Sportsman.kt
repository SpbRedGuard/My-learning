package anonymousClass2

class Sportsman : WaterBoy{
    override fun bringWater() {
        println("Вода принесена")
    }
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }

    // Перегрженный метод
    inline fun invokeWaterBoy (bringWater: () -> Unit) {
        bringWater()
    }
}
