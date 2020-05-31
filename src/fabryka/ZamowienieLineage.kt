package fabryka

class ZamowienieLineage(
    override var tytul: String,
    override var cenaSztuka: Double,
    override var liczbaSztuk: Int
) : IZamowienie {

}