package ex03

class ProdutoEletronico(var produto: String) {

    var preco = 0.0
    var voltagem = 0

    constructor(produto: String, preco: Double, voltagem: Int): this(produto){
        this.preco = preco
        this.voltagem = voltagem
    }

    fun ligado(tela: String){

        if(tela == "acesa" || tela == "Acesa"){
            println("O $produto está Ligado")
        }else{
            println("O $produto está Desligado")
        }
    }

}