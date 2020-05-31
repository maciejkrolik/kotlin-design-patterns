package polecenie

class WyciszWszystkoPolecenie (internal var odbiorcy : List<IOdbiorca>) : IPolecenie {

    override fun wykonaj() {
        for (odbiorca in odbiorcy) {
            odbiorca.wycisz()
        }
    }

}