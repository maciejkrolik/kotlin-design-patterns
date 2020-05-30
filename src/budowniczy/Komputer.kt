package budowniczy

class Komputer {

    val podzespoly = mutableListOf<String>()

    fun dodajPodzespol(podzespol: String) {
        podzespoly.add(podzespol)
    }

    fun pokaz() {
        println("--- Komputer ---")
        podzespoly.forEach { podzespol ->
            println(podzespol)
        }
    }
}