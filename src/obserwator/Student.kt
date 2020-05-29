package obserwator

class Student(
    private val imie: String,
    private val nazwisko: String
) : IStudent {

    override fun aktualizuj(przedmiot: Przedmiot) {
        println("Poinformowano $imie $nazwisko. Ocena wynosi ${przedmiot.ocena} z wagą ${przedmiot.waga}")
    }
}