package polecenie

class WlaczPolecenie (private val odbiorca: IOdbiorca) : IPolecenie {

    override fun wykonaj() {
        odbiorca.uruchom()
    }
}