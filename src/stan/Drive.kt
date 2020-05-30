package stan

class Drive : Bieg {

    override fun zmien(kontekst: Kontekst) {
        kontekst.bieg = Neutral()
    }
}