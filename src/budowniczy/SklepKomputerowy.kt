package budowniczy

class SklepKomputerowy {

    fun zlozKomputer(monter: MonterKomputerow) {
        monter.apply {
            dodajProcesor()
            dodajRAM()
            dodajDysk()
        }
    }
}