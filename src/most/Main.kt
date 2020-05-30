package most

fun main() {
    val kleryk = PostacPochodna(KlasaKleryk())
    kleryk.utworzPostac()

    val lucznik = PostacPochodna(KlasaLucznik())
    lucznik.utworzPostac()

    val mag = PostacPochodna(KlasaMag())
    mag.utworzPostac()

    val ninja = PostacPochodna(KlasaNinja())
    ninja.utworzPostac()

    val wojownik = PostacPochodna(KlasaWojownik())
    wojownik.utworzPostac()
}