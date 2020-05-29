package pamiatka

fun main() {
    val menedzerPlikow = MenedzerPlikow()
    menedzerPlikow.tresc = "Java"

    val system = System()
    system.plik = menedzerPlikow.utworzPlik()

    menedzerPlikow.tresc = "C#"

    if (system.plik != null)
        menedzerPlikow.przywrocPlik(system.plik!!)
    else
        println("Brak pliku!")
}