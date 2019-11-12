import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class TestSeasons {

    @Test
    fun testWinter() {
        val winter = "Зима"
        assertEquals(winter, getSeason(1))
        assertEquals(winter, getSeason(2))
        assertEquals(winter, getSeason(12))
    }

    @Test
    fun testSpring() {
        val spring = "Весна"
        assertEquals(spring, getSeason(3))
        assertEquals(spring, getSeason(4))
        assertEquals(spring, getSeason(5))
    }

    @Test
    fun testSummer() {
        val summer = "Лето"
        assertEquals(summer, getSeason(6))
        assertEquals(summer, getSeason(7))
        assertEquals(summer, getSeason(8))
    }

    @Test
    fun testFall() {
        val fall = "Осень"
        assertEquals(fall, getSeason(9))
        assertEquals(fall, getSeason(10))
        assertEquals(fall, getSeason(11))
    }

    @Test
    fun testWrongNumberOfSeason() {
        val error = "Ошибка"
        assertEquals(error, getSeason(0))
        assertEquals(error, getSeason(-1))
        assertEquals(error, getSeason(13))
    }
}