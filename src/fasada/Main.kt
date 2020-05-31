package fasada

fun main() {

    val komputer : IKomputer = Komputer(Cpu(), Ram(), Ssd())
    val wynik = komputer.wlacz()

    println(wynik)
}