val arrayOfInteger = arrayOf(1, 2, 3, -3, 0, -10)
fun main() {
    println(arrayWithNegativeFirst(arrayOfInteger).joinToString())
}

fun arrayWithNegativeFirst(array: Array<Int>): Array<Int> {
    val newArray = Array(array.size) { 0 }
    var i = 0
    var j = array.size - 1
    for (number in array) {
        if (number < 0) {
            newArray[i] = number
            i++
        } else {
            newArray[j] = number
            j--
        }
    }
    return newArray
}