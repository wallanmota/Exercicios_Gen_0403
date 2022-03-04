package ex01

class Cliente(var nome: String){

    var idade = 0
    var sexo = ""
    var celular = 0
    var endereco = ""

    constructor(
        nome: String,
        idade: Int,
        sexo: String,
        celular: Int,
        endereco: String
    ): this(nome){
        this.idade = idade
        this.sexo = sexo
        this.celular = celular
        this.endereco = endereco
    }

    fun apresentarInfo(){

        println("Olá $nome abaixo será exibido suas informações: " +
                "\nidade: $idade" +
                "\nsexo: $sexo" +
                "\ncelular: $celular" +
                "\nendereço: $endereco")
    }
}