package fabryka

class Steam : IPlatformaSprzedazowa {

    private val nazwa : String = "Steam"

    override fun utworzDokumentSprzedazy(): IZamowienie {
        return  ZamowienieLineage(
            tytul = "Lineage",
            cenaSztuka = 23.99,
            liczbaSztuk = 1
        )
    }

    override fun pobierzNazwe(): String {
        return nazwa
    }

}