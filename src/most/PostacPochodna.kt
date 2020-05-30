package most

class PostacPochodna (override var klasa: IKlasa) : IPostac {
    override fun utworzPostac() = klasa.podajNazwe()
}