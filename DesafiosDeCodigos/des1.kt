fun main() {

    val saldoAtual = readLine()!!.toFloat()
    val valorDeposito = readLine()!!.toFloat()
    val valorRetirada = readLine()!!.toFloat()
    fun calc_saldoAtual(sAtual: Float, valorDep: Float, valorRet: Float): Float{
        val attSald = sAtual + valorDep - valorRet
        return attSald
    }
println(" Saldo Atualizado: R$${calc_saldoAtual(saldoAtual, valorDeposito, valorRetirada)}")


}
