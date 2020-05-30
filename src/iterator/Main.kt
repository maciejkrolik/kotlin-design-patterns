package iterator

fun main() {

    val kontener = OwocowyKontener("pomarancza", "mandarynka", "jablko", "gruszka", "kiwi")

    val iterator = kontener.StworzIterator()

    println("Iteracja kolejcji")
    var element = iterator.Pierwszy()
    while (element != "brak") {
        println(element)
        element = iterator.Nastepny()
    }
}
