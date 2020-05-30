package pelnomocnik

class NormalnyPlik : IPlik {
    override fun odczytaj(nazwa: String) = println("Odczytywanie pliku: $nazwa")
}