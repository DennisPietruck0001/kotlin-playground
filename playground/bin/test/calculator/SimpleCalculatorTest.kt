package calculator


import calculator.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import kotlin.math.cos
import kotlin.math.sin

internal class SimpleCalculatorTest {

    @Test
    fun `should return addition`() {
        //given
        val a: Int = 42
        val b: Int = 55
        //when
        val result = addition(a, b)
        //then
        assertThat(result).isEqualTo(97)
    }

    @Test
    fun `should return deduction`() {
        //given
        val a: Int = 42
        val b: Int = 55
        //when
        val result = deduction(a, b)
        //then
        assertThat(result).isEqualTo(-13)
    }

    @Test
    fun `should return multiplication`() {
        //given
        val a: Int = 42
        val b: Int = 55
        //when
        val result = multiplication(a, b)
        //then
        assertThat(result).isEqualTo(2310)
    }

    @Test
    fun `should return division`() {
        //given
        val a: Double = 42.0000
        val b: Double = 55.0000
        //when
        val result = division(a, b)
        //then
        assertThat(result).isEqualTo(0.7636)
    }

    @Test
    fun `should return factorial`() {
        //given
        val a: Int = 4
        //when
        val result = faculty(a)
        //then
        assertThat(result).isEqualTo(24)
    }

    @Test
    fun `should return sinus`() {
        //given
        val a: Double = 4.0000
        //when
        val result = sinus(a)
        //then
        assertThat(result).isEqualTo(sin(4.0000))
    }

    @Test
    fun `should return cosinus`() {
        //given
        val a: Double = 4.0000
        //when
        val result = cosinus(a)
        //then
        assertThat(result).isEqualTo(cos(4.0000))
    }

    @Test
    fun `should return power`() {
        //given
        val a: Int = 2
        val b: Int = 3
        //when
        val result = power(a, b)
        //then
        assertThat(result).isEqualTo(8.0000)
    }
}