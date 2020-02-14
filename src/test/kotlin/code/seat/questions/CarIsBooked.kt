package code.seat.questions

import code.seat.ui.BookingConfirmationWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question

class CarIsBooked : Question<Boolean>{

    override fun answeredBy(actor: Actor): Boolean {
        return BookingConfirmationWindow.BOOKING_CONFIRMATION_TEXT.resolveFor(actor).isCurrentlyVisible
    }

}