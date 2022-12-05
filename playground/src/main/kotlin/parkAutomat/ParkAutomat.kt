package parkAutomat

import java.time.LocalDateTime


class ParkAutomat {
    fun pullTicket(KfZkennzeichen: String): Ticket {
        return Ticket(KfZkennzeichen, LocalDateTime.now())
    }

    data class Ticket(val kennzeichen: String, val uhrzeit: LocalDateTime) {

    }
}