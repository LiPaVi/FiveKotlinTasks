import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestNumberPrinter {

    @Test
    fun testsGetNumberByWords() {
        assertEquals("тысяча", getNumberByWords(1000))
        assertEquals("девятьсот девяносто девять", getNumberByWords(999))
        assertEquals("восемьсот одиннадцать", getNumberByWords(811))
        assertEquals("семьсот шестнадцать", getNumberByWords(716))
        assertEquals("шестьсот четырнадцать", getNumberByWords(614))
        assertEquals("пятьсот тринадцать", getNumberByWords(513))
        assertEquals("четыреста двадцать три", getNumberByWords(423))
        assertEquals("триста двенадцать", getNumberByWords(312))
        assertEquals("двести сорок четыре", getNumberByWords(244))
        assertEquals("сто один", getNumberByWords(101))
        assertEquals("восемьдесят семь", getNumberByWords(87))
        assertEquals("семьдесят восемь", getNumberByWords(78))
        assertEquals("шестьдесят пять", getNumberByWords(65))
        assertEquals("пятьдесят два", getNumberByWords(52))
        assertEquals("тридцать пять", getNumberByWords(35))
        assertEquals("девятнадцать", getNumberByWords(19))
        assertEquals("восемнадцать", getNumberByWords(18))
        assertEquals("пятнадцать", getNumberByWords(15))
        assertEquals("десять", getNumberByWords(10))
        assertEquals("шесть", getNumberByWords(6))
        assertEquals("Ошибка", getNumberByWords(0))
        assertEquals("Ошибка", getNumberByWords(1001))
    }
}