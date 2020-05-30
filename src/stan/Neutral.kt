package stan

class Neutral : Bieg {

    override fun zmien(kontekst: Kontekst) {
        kontekst.bieg = Reverse()
    }
}