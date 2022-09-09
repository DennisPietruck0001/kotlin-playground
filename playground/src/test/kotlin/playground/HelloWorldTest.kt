package playground

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HelloWorldTest {
    @Test
    fun `should return Hello World!`() {
        // given
        // when
        val result = helloWorld()
        // then
        assertThat(result).isEqualTo("Hello World!")
    }
}
