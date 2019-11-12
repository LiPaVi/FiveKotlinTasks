const val number = 1000
fun main() {
    print(getReserveNum(number))
}

internal fun getReserveNum(num: Int): String {
    return when (checkCountThree(num)) {
        true -> reverseNum(num)
        false -> "Ошибка"
    }
}

private fun checkCountThree(num: Int): Boolean = num in 100..1000
private fun reverseNum(num: Int): String = num.toString().reversed()