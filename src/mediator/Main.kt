package mediator

fun main() {

    val wieza = WiezaKontrolna()
    val samolot: IMaszynyLotnicze = Samolot(wieza)
    val helikopter : IMaszynyLotnicze = Helikopter(wieza)

    wieza.samolot = samolot
    wieza.helikopter = helikopter

    // wysłanie wiadomości przez wieżę kontrolną
    samolot.wyslij("Cześć z samolotu")
    println(samolot.odczytajWiadomosc())

    helikopter.wyslij("Cześć z helikoptera")

    // odebranie wiadomości z helikoptera
    println(helikopter.odczytajWiadomosc())
}

