package dekorator

fun main() {
    val rower = Rower("Aluminiowa", "40", 2)
    rower.pokaz()

    val samochod = Samochod("Mazda", "6", 4)
    samochod.pokaz()

    println("\n--- Modyfikacje ---")

    val modyfikowalnyRower = Modyfikowalny(rower)
    modyfikowalnyRower.modyfikujLiczbeKol(3)
    modyfikowalnyRower.pokaz()

    val modyfikowalnySamochod = Modyfikowalny(samochod)
    modyfikowalnySamochod.modyfikujLiczbeKol(6)
    modyfikowalnySamochod.pokaz()
}