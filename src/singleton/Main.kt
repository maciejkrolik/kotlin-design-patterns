package singleton

fun main() {
    val gracz = Gracz
    println("Nick gracza: ${gracz.nick} Ranking gracza: ${gracz.ranking}")


    Gracz.ranking += 10
    val gracz2 = Gracz
    println("Nick gracza: ${gracz2.nick} Ranking gracza: ${gracz2.ranking}")
}