package polecenie

class PrzyciskWywolywacz (var polecenie : IPolecenie) {

    fun kliknij() {
        polecenie.wykonaj()
    }

}