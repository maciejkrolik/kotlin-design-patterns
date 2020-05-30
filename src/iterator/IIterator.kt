package iterator

interface IIterator {

    fun Pierwszy() : Any

    fun Nastepny() : Any

    fun CzyKoniec() : Boolean

    fun PobierzElement() : Any
}