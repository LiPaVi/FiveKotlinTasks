fun main() {
    val numberOfMonth = 10
    print(getSeason(numberOfMonth))
}

internal fun getSeason(numberOfMonth: Int): String {
    return when (numberOfMonth) {
        1, 2, 12 -> "Зима"
        3, 4, 5 -> "Весна"
        6, 7, 8 -> "Лето"
        9, 10, 11 -> "Осень"
        else -> "Ошибка"
    }
}