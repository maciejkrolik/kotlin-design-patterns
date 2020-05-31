package kompozyt

class Pracownik(
    private val nazwa: String
) : Element(nazwa) {

    override fun dodaj(element: Element) {
        println("Nie można dodać do pracownika")
    }

    override fun usun(element: Element) {
        println("Nie można usunąć od pracownika")
    }

    override fun pokaz(poziom: Int) {
        repeat(poziom) { print("-") }
        println(nazwa)
    }
}