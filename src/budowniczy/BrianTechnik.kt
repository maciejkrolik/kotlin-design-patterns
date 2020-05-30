package budowniczy

class BrianTechnik : MonterKomputerow {

    private val komputer = Komputer()

    override fun dodajProcesor() {
        komputer.dodajPodzespol("I9 9900K 4.5GHz")
    }

    override fun dodajDysk() {
        komputer.dodajPodzespol("2TB")
    }

    override fun dodajRAM() {
        komputer.dodajPodzespol("64GB DDR4")
    }

    override fun przekazKomputer(): Komputer {
        return komputer
    }
}