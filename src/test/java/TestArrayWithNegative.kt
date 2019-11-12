import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class TestArrayWithNegative {

    @Test
    fun testArrayWithoutNegative() {
        val array = arrayOf(1)
        assertArrayEquals(arrayOf(1), arrayWithNegativeFirst(array))
    }

    @Test
    fun testEmptyArray() {
        val array = arrayOf<Int>()
        assertArrayEquals(arrayOf<Int>(), arrayWithNegativeFirst(array))
    }

    @Test
    fun testArrayWithNegativeLast() {
        val array = arrayOf(1, -2)
        assertArrayEquals(arrayOf(-2, 1), arrayWithNegativeFirst(array))
    }

    @Test
    fun testArrayWithNegativeFirst() {
        val array = arrayOf(-1, 2)
        assertArrayEquals(arrayOf(-1, 2), arrayWithNegativeFirst(array))
    }

    @Test
    fun testArrayWithZero() {
        val array = arrayOf(0, -10000, 0)
        assertArrayEquals(arrayOf(-10000, 0, 0), arrayWithNegativeFirst(array))
    }

    @Test
    fun testArrayWithOnlyNegative() {
        val array = arrayOf(-5, -2, -3)
        assertArrayEquals(arrayOf(-5, -2, -3), arrayWithNegativeFirst(array))
    }
}