package parkAutomat

import java.time.LocalDateTime


class ParkAutomat {
    data class Ticket(val kennzeichen: String, val uhrzeit: LocalDateTime)
    fun pullTicket(kennzeichen: String): Ticket {
        return Ticket(kennzeichen, LocalDateTime.now())
    }
}