package code.seat.questions

import code.seat.ui.AllowLocationWindow
import net.serenitybdd.screenplay.Actor
import net.serenitybdd.screenplay.Question

class SelectLocationOption : Question<Boolean> {

    override fun answeredBy(actor: Actor): Boolean{
        return AllowLocationWindow.ALLOW_ONCE.resolveFor(actor).isCurrentlyVisible
    }

}
