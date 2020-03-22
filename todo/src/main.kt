fun main(){

    for (i in 1..5) {

        /**
        if(i == 2) {
            break
        }
        **/

        val titular: String =  "Ivan - $i"
        val numConta: Int = 1000 + 1
        var saldo: Double = i * 0.134 + 13.5

        println("----------------")

        println("titular: $titular")
        println("conta: $numConta")
        println("saldo: $saldo")

        println("----------------")

        statusConta(saldo)

        for (i in 3 downTo 1){
            println(i)
        }
        println()
    }

}

fun statusConta( saldo: Double) {
    when {
        saldo > 0.0 -> println("status: positiva")
        saldo == 0.0 -> println("status: neutro")
        else -> println("status: negativa")
    }
}