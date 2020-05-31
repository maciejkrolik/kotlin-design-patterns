package polecenie

class WiezaStereo : IOdbiorca {
    override fun uruchom() {
        println("Wieża stereo została włączona.")
    }

    override fun wycisz() {
        println("Wieża stereo została wyciszona.")
    }
}