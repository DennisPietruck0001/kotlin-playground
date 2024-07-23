package lernfeld02


import lernfeld02.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class mainTest {

    @Test
    fun `should return addition`() {
        //given
        val a: Int = 42
        val b: Int = 55
        //when
        val result = sumMe(a, b)
        //then
        assertThat(result).isEqualTo(97)
    }

    @Test
    fun `should return Hello Lisa`() {
        val result = printLisa()
        assertThat(result).isEqualTo("Hello Lisa")
    }
}