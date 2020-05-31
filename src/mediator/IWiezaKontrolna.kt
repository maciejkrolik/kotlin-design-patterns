package mediator

interface IWiezaKontrolna {
    fun zglosHelikopter(wiadomosc: String) : Unit?
    fun zglosSamolot(wiadomosc: String) : Unit?

}