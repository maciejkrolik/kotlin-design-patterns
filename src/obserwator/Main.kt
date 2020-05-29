package obserwator

fun main() {
    val student1 = Student("Jan", "Kowalski")
    val student2 = Student("Marcin", "Nowak")

    val przedmiot = CloudComputing(3, 5)
    przedmiot.dolacz(student1)
    przedmiot.dolacz(student2)

    przedmiot.ocena = 4
    przedmiot.ocena = 3
    przedmiot.ocena = 2
    przedmiot.ocena = 5
}