const val numberOfMonth = 10
fun main() {
    printSeason(numberOfMonth)
}

private fun printSeason(numberOfMonth: Int) {
    when (numberOfMonth) {
        1, 2, 12 -> print("Зима")
        3, 4, 5 -> print("Весна")
        6, 7, 8 -> print("Лето")
        9, 10, 11 -> print("Осень")
        else -> print("Ошибка")
    }
}