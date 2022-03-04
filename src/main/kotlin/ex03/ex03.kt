package ex03

fun main(){
    /*
    Crie uma classe produto eletrônico e apresente os atributos e métodos referentes esta classe,
     em seguida crie um objeto produto eletrônico, defina as instancias deste objeto e
     apresente as informações deste objeto no console.
     */

    val celular = ProdutoEletronico("Celular", 1000.0, 110)

    println("Como está a tela do ${celular.produto} (acesa ou apagada)? ")
    val tela = readLine()!!

    celular.ligado(tela)
}