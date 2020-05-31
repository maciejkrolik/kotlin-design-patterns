package kompozyt

abstract class Element(
    private val nazwa: String
) {

    abstract fun dodaj(element: Element)

    abstract fun usun(element: Element)

    abstract fun pokaz(poziom: Int)
}