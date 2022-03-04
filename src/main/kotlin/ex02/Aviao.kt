package ex02

class Aviao {

    var marca = ""
    var cor = ""
    var porte = ""
    var tipo = ""

    constructor(marca: String, cor: String, porte: String, tipo: String){

        this.marca = marca
        this.cor = cor
        this.porte = porte
        this.tipo = tipo
    }

    fun voar(condi: String){

        if(condi == "s" || condi == "S"){
            println("Condições para voo OK, voo autorizado!!!")
        }else{
            println("Voo não autorizado!!!")
        }
    }

}