package mediator

class Samolot (private val wieza : IWiezaKontrolna) : IMaszynyLotnicze {

    var odebranaWiadomosc : String = ""

    override fun odbierz(wiadomosc: String) {
        odebranaWiadomosc = wiadomosc
    }

    override fun wyslij(wiadomosc: String) = wieza.zglosSamolot(wiadomosc)

    override fun odczytajWiadomosc(): String {
        return odebranaWiadomosc
    }
}