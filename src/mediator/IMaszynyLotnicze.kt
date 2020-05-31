package mediator

interface IMaszynyLotnicze {
    fun wyslij(wiadomosc : String) : Unit?
    fun odbierz(wiadomosc : String) : Unit?
    fun odczytajWiadomosc() : String
}