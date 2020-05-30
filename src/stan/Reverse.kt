package stan

class Reverse : Bieg {

    override fun zmien(kontekst: Kontekst) {
        kontekst.bieg = Drive()
    }
}