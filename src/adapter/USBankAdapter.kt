package adapter

class USBankAdapter(
    private val wellsFargo: WellsFargo
) : Bank {

    override fun pobierzPieniadze(): Double {
        return wellsFargo.getMoney() * 4.01
    }
}