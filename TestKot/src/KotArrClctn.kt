
fun main() {
    // массив Int с null
    val array: Array<Int?> = arrayOf(1,2,3,4,5, null)
    println(array[4])
    println(array[5])

    //массив String с null
    val array2: Array<String?> = arrayOf("один", "два", "три", null)
    println("Размер массива ${array2.size}")

    //массив заполненный null
    val array3: Array<Int?> = arrayOfNulls(10)
    println(array3[1])
}