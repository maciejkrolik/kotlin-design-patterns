package fabryka

fun main() {

    // Tablica Platform Sprzedażowych
    val platformy = mutableListOf<IPlatformaSprzedazowa>()

    // Dodanie platform
    val platformaSteam = Steam()
    val platformaUplay = UPlay()

    platformy.add(platformaSteam)
    platformy.add(platformaUplay)

    for (dokumenty in platformy) {

        var pozycja = dokumenty.utworzDokumentSprzedazy()

        println(
            "Utworzone dokumenty: ${dokumenty.pobierzNazwe()}, " +
            "tytul: ${pozycja.tytul}, " +
            "liczba: ${pozycja.liczbaSztuk}, " +
            "cena za szt.: ${pozycja.cenaSztuka}, " +
            "cena całkowita: ${pozycja.liczbaSztuk * pozycja.cenaSztuka}"
        )
    }


}

