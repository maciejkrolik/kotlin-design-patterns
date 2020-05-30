package budowniczy

class JanuszTechnik : MonterKomputerow {

    private val komputer = Komputer()

    override fun dodajProcesor() {
        komputer.dodajPodzespol("Pentium 1.5 GHz")
    }

    override fun dodajDysk() {
        komputer.dodajPodzespol("5GB")
    }

    override fun dodajRAM() {
        komputer.dodajPodzespol("2GB DDR2")
    }

    override fun przekazKomputer(): Komputer {
        return komputer
    }
}