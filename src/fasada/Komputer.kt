package fasada

class Komputer (private val cpu: Cpu, private val ram: Ram, private val ssd: Ssd) : IKomputer {

    override fun wlacz(): String = "${cpu.start()}, ${ram.zaladuj()}, ${ssd.czytaj()}"
}