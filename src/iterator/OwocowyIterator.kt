package iterator

class OwocowyIterator (kontener: OwocowyKontener) : IIterator {

    private val kontener = kontener
    private var obecny : Int = 0


    override fun Pierwszy(): Any {
        return kontener.owoce[0]
    }

    override fun Nastepny(): Any {
        if (obecny < kontener.ilosc() - 1) {
            return kontener.owoce[++obecny]
        }
        return "brak"
    }

    override fun CzyKoniec(): Boolean {
        return obecny >= kontener.ilosc()
    }

    override fun PobierzElement(): Any {
        return kontener.owoce[obecny]
    }
}
