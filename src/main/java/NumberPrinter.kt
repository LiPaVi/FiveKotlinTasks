val arrayOfTensAndUnits = arrayOf("",
        "один", "два", "три", "четыре", "пять",
        "шесть", "семь", "восемь", "девять", "десять",
        "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
        "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
val arrayOfTens = arrayOf("", "",
        "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")
val arrayOfHundreds = arrayOf("",
        "сто", "двести", "триста", "четыреста", "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот")
val arrayOfThousands = arrayOf("", "тысяча")

fun main() {
    val num = 999
    print(getNumberByWords(num))
}

internal fun getNumberByWords(number: Int): String {
    if (number !in 1..1000) {
        return "Ошибка"
    }
    val numberByWords = mutableListOf<String>()
    var newNum = number
    numberByWords.add(arrayOfThousands[newNum / 1000])
    newNum %= 1000
    numberByWords.add(arrayOfHundreds[newNum / 100])
    newNum %= 100
    if (newNum >= 20) {
        numberByWords.add(arrayOfTens[newNum / 10])
        newNum %= 10
    }
    numberByWords.add(arrayOfTensAndUnits[newNum])
    return numberByWords.filter { it != "" }.joinToString(" ")
}