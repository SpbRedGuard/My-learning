fun main() {
    //В работе с коллекциями лучше использовать абстракции
    //приводить к родительскому типу Mutable
    val listOfNum: MutableList<Int> = mutableListOf()
    listOfNum.add(9)
    listOfNum.add(8)
    listOfNum.add(7)
    listOfNum.add(6)
    listOfNum.add(5)
    listOfNum.add(4)
    listOfNum.add(6)
    println(listOfNum.toString())
    listOfNum.remove(6)
    listOfNum.remove(8)
    println(listOfNum.toString())
}