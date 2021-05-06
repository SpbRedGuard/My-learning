package abstrSmartCast

fun main() {
     val workers = mutableListOf<Worker>()
    workers.add(Seller("Ivan", 28))
    workers.add(Seller("Anatoliy", 29))
    workers.add(Seller("Boris", 26))
    workers.add(Programmer("Maks", 26, "Kotlin"))
    workers.add(Programmer("Alex", 29, "Java"))
    workers.add(Director("Dmitriy", 34))
    for (worker in workers){
        worker.work()
        if (worker is Cleaner){ //автоматическое приведение к типу SmartCast
            worker.clean()
        }
    }
/*
Из коллекции работников получить коллекцию уборщиков
На вход приходит List<Worker>, на выходе List<Cleaner>
 */

    val cleaners = workers.filter {it is Cleaner}.map {it as Cleaner}
    for(cleaner in cleaners)
        cleaner.clean()
}