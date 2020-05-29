package obserwator

abstract class Przedmiot(val waga: Int, ocena: Int) {

    var ocena = ocena
        set(value) {
            if (field != value) {
                field = value
                powiadom()
            }
        }

    private val studenci = mutableListOf<IStudent>()

    fun dolacz(student: IStudent) {
        studenci.add(student)
    }

    fun odlacz(student: IStudent) {
        studenci.add(student)
    }

    fun powiadom() {
        studenci.forEach { student -> student.aktualizuj(this) }
    }
}