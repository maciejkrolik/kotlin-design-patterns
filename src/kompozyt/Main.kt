package kompozyt

fun main() {
    val google = Kompozyt("Google")
    google.dodaj(Pracownik("Pracownik 1"))
    google.dodaj(Pracownik("Pracownik 2"))

    val biuro1 = Kompozyt("Biuro A")
    biuro1.dodaj(Pracownik("Pracownik A1"))
    biuro1.dodaj(Pracownik("Pracownik A2"))

    google.dodaj(biuro1)
    google.dodaj(Pracownik("Pracownik 3"))

    val pracownik4 = Pracownik("Pracownik 4")
    google.dodaj(pracownik4)
    google.usun(pracownik4)

    google.pokaz(1)
}