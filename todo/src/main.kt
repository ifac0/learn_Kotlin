fun main(){
    println("----------Contas Criadas----------")
    val contaIvan = Conta()
    contaIvan.titular = "Ivan"
    contaIvan.numero = 123
    println(contaIvan.toString())
    contaIvan.deposita(10.78)

    val contaFelipe = Conta()
    contaFelipe.titular = "Felipe"
    contaFelipe.numero = 258
    println(contaFelipe.toString())
    contaFelipe.deposita(38.89)

    println()
    println("----------ações----------")
    contaFelipe.deposita(1000.0)
    contaFelipe.saca(348.75)
    contaFelipe.saca(10000.00)

    contaFelipe.transfere(contaIvan, 500.00)
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0
        private set

    fun deposita(valor : Double){
        saldo += valor
        println("novo saldo de $titular: $saldo")
    }

    fun saca(valor : Double){
        if(saldo >= valor){
            saldo -= valor
            println("novo saldo de $titular: $saldo")
        } else {
            println("saldo indisponivel")
        }
    }

    fun transfere(destino : Conta, valor : Double){
        this.saca(valor)
        destino.deposita(valor)
    }

    override fun toString(): String {
        return "titular: $titular, numero: $numero, saldo: $saldo"
    }
}