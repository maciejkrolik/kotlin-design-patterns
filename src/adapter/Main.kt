package adapter

fun main() {
    val bank: Bank = USBankAdapter(WellsFargo())
    println("Wells Fargo pobiera pieniądze w złotówkach: ${bank.pobierzPieniadze()}")
}