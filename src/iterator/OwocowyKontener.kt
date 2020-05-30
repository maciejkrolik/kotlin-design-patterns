package iterator

class OwocowyKontener (vararg val owoce : String) : IKontener {

    fun ilosc() : Int {
        return owoce.count()
    }

    override fun StworzIterator(): IIterator {
        return OwocowyIterator(this)
    }
}