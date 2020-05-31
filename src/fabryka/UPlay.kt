package fabryka


class UPlay : IPlatformaSprzedazowa {

    private val nazwa : String = "Uplay"

    override fun utworzDokumentSprzedazy(): IZamowienie {
        return ZamowienieHeroes(
            tytul = "Heroes",
            liczbaSztuk = 2,
            cenaSztuka = 100.22
        )
    }

    override fun pobierzNazwe(): String {
        return nazwa
    }
}