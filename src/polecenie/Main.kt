package polecenie

fun main() {

    val telewizor = Telewizja()
    val wieza = WiezaStereo()
    val wszystko = ArrayList<IOdbiorca>()
    wszystko.add(telewizor)
    wszystko.add(wieza)

    val wlacz = WlaczPolecenie(telewizor)
    val przyciskWlacz = PrzyciskWywolywacz(wlacz)
    przyciskWlacz.kliknij()

    val wyciszWszystko = WyciszWszystkoPolecenie(wszystko)
    val przyciskWycisz = PrzyciskWywolywacz(wyciszWszystko)
    przyciskWycisz.kliknij()

}