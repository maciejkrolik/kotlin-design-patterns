package budowniczy

fun main() {
    val janusz: MonterKomputerow = JanuszTechnik()
    val brian: MonterKomputerow = BrianTechnik()
    val sklepKomputerowy = SklepKomputerowy()

    sklepKomputerowy.zlozKomputer(janusz)
    janusz
        .przekazKomputer()
        .pokaz()

    sklepKomputerowy.zlozKomputer(brian)
    brian
        .przekazKomputer()
        .pokaz()
}