package stan

class Kontekst(bieg: Bieg) {

    private var stan: Bieg? = null

    var bieg
        get() = stan!!
        set(value) {
            stan = value
            println("Bieg: ${stan!!.javaClass.simpleName}")
        }

    init {
        this.bieg = bieg
    }

    fun pokaz() {
        stan!!.zmien(this)
    }
}
