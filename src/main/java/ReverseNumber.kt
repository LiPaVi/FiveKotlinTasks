const val number = 1000
fun main() {
    if (checkCountThree(number)) {
        print(reverseNum(number))
    } else print("Ошибка")
}

private fun checkCountThree(num: Int): Boolean = num in 100..1000
private fun reverseNum(num: Int): Int = num.toString().reversed().toInt()