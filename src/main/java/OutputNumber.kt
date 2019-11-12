fun main() {
    val input: String? = readLine()
    print(checkNumber(input))
}

internal fun checkNumber(input: String?): String {
    return when (input?.toIntOrNull()) {
        null -> "Ошибка"
        else -> "Вы ввели число $input"
    }
}