package abstrSmartCast

class Programmer(name: String, age: Int, private val language: String) : Worker(name, age), Cleaner {
    override fun work() {
        println("Пишу код на $language")
    }

    override fun clean() {
        println("Программист убирает")
    }
}