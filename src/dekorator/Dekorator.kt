package dekorator

abstract class Dekorator(
    private val pojazd: Pojazd
) : Pojazd() {

    override fun pokaz() {
        pojazd.pokaz()
    }
}