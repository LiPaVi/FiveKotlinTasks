import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestOutputNumber {

    @Test
    fun testPrintPositiveNumber() {
        val number = "12"
        assertEquals("Вы ввели число $number", checkNumber(number))
    }

    @Test
    fun testPrintZeroNumber() {
        val number = "0"
        assertEquals("Вы ввели число $number", checkNumber(number))
    }

    @Test
    fun testPrintNegativeNumber() {
        val number = "-100"
        assertEquals("Вы ввели число $number", checkNumber(number))
    }

    @Test
    fun testPrintStrangeNumber() {
        val number = "-001"
        assertEquals("Вы ввели число $number", checkNumber(number))
    }

    @Test
    fun testPrintMaxNumber() {
        val number = Int.MAX_VALUE.toString()
        assertEquals("Вы ввели число $number", checkNumber(number))
    }

    @Test
    fun testPrintNotNumber() {
        val notNumber = "-21A23"
        assertEquals("Ошибка", checkNumber(notNumber))
    }

    @Test
    fun testPrintEmptyNumber() {
        val notNumber = ""
        assertEquals("Ошибка", checkNumber(notNumber))
    }

    @Test
    fun testPrintMoreThenMaxNumber() {
        val bigNumber = "2147483648"
        assertEquals("Ошибка", checkNumber(bigNumber))
    }

    @Test
    fun testPrintLessThenMinMinNumber() {
        val smallNumber = "-2147483649"
        assertEquals("Ошибка", checkNumber(smallNumber))
    }

    @Test
    fun testPrintNotIntNumber() {
        val notNumber = "1.2"
        assertEquals("Ошибка", checkNumber(notNumber))
    }
}