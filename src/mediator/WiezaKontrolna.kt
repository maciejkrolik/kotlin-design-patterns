package mediator

class WiezaKontrolna : IWiezaKontrolna {

    var samolot: IMaszynyLotnicze ? = null
    var helikopter: IMaszynyLotnicze ? = null

    override fun zglosHelikopter(wiadomosc: String) = samolot?.odbierz(wiadomosc)

    override fun zglosSamolot(wiadomosc: String) = helikopter?.odbierz(wiadomosc)

}