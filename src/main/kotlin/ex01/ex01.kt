package ex01

fun main() {
    /*
    Crie uma classe cliente e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as
    informações deste objeto no console.
     */

    val cliente1 = Cliente(
        "João",
        30,
        "masculino",
        1100000000,
        "rua 123")

    cliente1.apresentarInfo()
}
