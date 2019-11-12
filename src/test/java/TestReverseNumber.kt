import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestReverseNumber {

    @Test
    fun testReverseThreeDigitNumber() {
        val number = 123
        assertEquals("321", getReserveNum(number))
    }

    @Test
    fun testReverseThreeDigitNumberWithZero() {
        val number = 100
        assertEquals("001", getReserveNum(number))
    }

    @Test
    fun testReverseTwoDigitNumber() {
        val number = 12
        assertEquals("Ошибка", getReserveNum(number))
    }

    @Test
    fun testReverseFourDigitNumber() {
        val number = 1234
        assertEquals("Ошибка", getReserveNum(number))
    }

    @Test
    fun testReverseNegativeNumber() {
        val number = -123
        assertEquals("Ошибка", getReserveNum(number))
    }
}