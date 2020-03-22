fun main(){
    val contaIvan = Conta()
    contaIvan.titular = "Ivan"
    contaIvan.numero = 123
    contaIvan.saldo = 10.78
    println(contaIvan.toString())

    val contaFelipe = Conta()
    contaFelipe.titular = "Felipe"
    contaFelipe.numero = 258
    contaFelipe.saldo = 38.89
    println(contaFelipe.toString())
}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    override fun toString(): String {
        return "titular: $titular, numero: $numero, saldo: $saldo"
    }
}