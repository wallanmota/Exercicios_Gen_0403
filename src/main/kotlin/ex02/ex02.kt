package ex02

fun main(){
    /*
    Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
    em seguida crie um objeto avião, defina as instancias deste objeto e apresente as informações
    deste objeto no console.
     */

    val aviao = Aviao("Boing", "branco", "grande", "passageiro")

    println("O avião da ${aviao.marca} está em condições para voar? (S/N)")
    val condi = readLine()!!

    aviao.voar(condi)

}