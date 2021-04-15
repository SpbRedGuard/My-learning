fun main() {
    val result = modifyString("Hello world!") {it.toUpperCase()}
    println(result)
   val list = (0 .. 100).toList()
   listMod(list) //{println(it.sum())}
   {println(it.sum())}
}

fun modifyString (string: String, modify: (String) -> String ) : String {
    return modify(string)
}
    // Создать метод, принимающий первым параметром коллекцию чисел и функцию, которвая оперирует данной коллекцией
    // Создать коллекцию чисел и с помощью созданного метода вывести сумму всех элементов коллекции на экран

 inline fun listMod (list: List<Int>, mod:(List<Int>) -> Unit){
     mod(list)
 }

