package fabryka

interface IPlatformaSprzedazowa {
    fun utworzDokumentSprzedazy() : IZamowienie
    fun pobierzNazwe() : String
}