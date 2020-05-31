package kompozyt

class Kompozyt(
    private val nazwa: String
) : Element(nazwa) {

    private val dzieci = mutableListOf<Element>()

    override fun dodaj(element: Element) {
        dzieci.add(element)
    }

    override fun usun(element: Element) {
        dzieci.remove(element)
    }

    override fun pokaz(poziom: Int) {
        repeat(poziom) { print("-") }
        println(nazwa)

        dzieci.forEach { element ->
            element.pokaz(poziom + 2)
        }
    }
}