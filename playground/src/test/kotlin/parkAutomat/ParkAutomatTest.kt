package parkAutomat

import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.time.LocalDateTime

internal class ParkAutomatTest {
    @Test
    fun `should return new Park Ticket`() {
        val parkAutomat = ParkAutomat()

        val ticket = parkAutomat.pullTicket("")

        assertThat(ticket).isInstanceOf(ParkAutomat.Ticket::class.java)
    }

    @Test
    fun `should set kennzeichen on new Ticket`() {
        val parkAutomat = ParkAutomat()
        val testKennzeichen = "HH-SK-1234"

        val ticket = parkAutomat.pullTicket(testKennzeichen)

        assertThat(ticket.kennzeichen).isEqualTo(testKennzeichen)
    }

    @Test
    fun `should set uhrzeit on new Ticket`() {
        val parkAutomat = ParkAutomat()

        val ticket = parkAutomat.pullTicket("HH-SK-1234")

        assertThat(ticket.uhrzeit).isBeforeOrEqualTo(LocalDateTime.now())
    }
}