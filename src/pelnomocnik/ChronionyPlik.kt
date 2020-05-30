package pelnomocnik

class ChronionyPlik : IPlik {
    val normalnyPlik = NormalnyPlik()
    var haslo: String = ""

    override fun odczytaj(nazwa: String) {
        if (haslo == "tajnehaslo") {
            println("Hasło $haslo jest poprawne. Dostęp przyznany.")
            normalnyPlik.odczytaj(nazwa)
        }
        else {
            println("Haslo $haslo jest niepoprawne. Dostęp zablokowany.")
        }
    }
}