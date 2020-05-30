package dekorator

class Samochod(
    private val marka: String,
    private val model: String,
    liczbaKol: Int
) : Pojazd() {

    init {
        this.liczbaKol = liczbaKol
    }

    override fun pokaz() {
        println("\nSamochód ------")
        println(" Marka $marka")
        println(" Model $model")
        println(" # Liczba kół $liczbaKol")
    }
}