package dekorator

class Rower(
    private val modelRamy: String,
    private val opony: String,
    liczbaKol: Int
) : Pojazd() {

    init {
        this.liczbaKol = liczbaKol
    }

    override fun pokaz() {
        println("\nRower ------")
        println(" Model ramy $modelRamy")
        println(" Opony $opony")
        println(" # Liczba kół $liczbaKol")
    }
}