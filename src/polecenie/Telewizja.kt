package polecenie

class Telewizja: IOdbiorca {
    override fun uruchom() {
        println("Telewizja została włączona.")
    }

    override fun wycisz() {
        println("Telewizja została wyciszona.")
    }
}