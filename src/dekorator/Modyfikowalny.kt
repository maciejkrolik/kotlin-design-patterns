package dekorator

class Modyfikowalny(
    private val pojazd: Pojazd
) : Dekorator(pojazd) {

    fun modyfikujLiczbeKol(liczbaKol: Int) {
        pojazd.liczbaKol = liczbaKol
    }

    override fun pokaz() {
        pojazd.pokaz()
        println("ZMODYFIKOWANY")
    }
}