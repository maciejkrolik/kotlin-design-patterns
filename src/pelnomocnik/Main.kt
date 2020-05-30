package pelnomocnik

fun main() {
    val chronionyPlik = ChronionyPlik()
    // próba odczytu bez hasła
    chronionyPlik.odczytaj("readme.md")

    // próba odczytu z błędnym hasłem
    chronionyPlik.haslo = "sekretnehaslo"
    chronionyPlik.odczytaj("readme.md")

    // próba odczytu z poprawnym hasłem
    chronionyPlik.haslo = "tajnehaslo"
    chronionyPlik.odczytaj("readme.md")
}