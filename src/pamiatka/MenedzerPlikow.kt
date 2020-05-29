package pamiatka

class MenedzerPlikow {

    var tresc: String = ""
        set(value) {
            field = value
            println("Treść: $field")
        }

    fun utworzPlik(): Plik {
        return Plik(tresc)
    }

    fun przywrocPlik(plik: Plik) {
        println("Przywracanie pliku...")
        tresc = plik.tresc
    }
}