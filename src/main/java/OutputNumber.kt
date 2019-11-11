fun main() {
    val input: String? = readLine()
    printNumber(input)
}

private fun printNumber(input: String?) {
    val integerNumber: Int? = input?.toIntOrNull()
    if (integerNumber != null) {
        print("Вы ввели число ${input.toInt()}")
    } else {
        print("Ошибка")
    }
}