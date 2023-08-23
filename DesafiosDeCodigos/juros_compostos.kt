import java.text.DecimalFormat
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.roundToLong

fun main() {

    val valorInicial = readln()!!.toDouble()

    val taxaJuros = readln()!!.toDouble()

    val periodo = readln()!!.toInt()

    var valorFinal = valorInicial

    val df = DecimalFormat("#.00")

    fun calcularInvestimento(vaInicial: Double, taxaJuros: Double, periodo: Int): Double{
        val valorFinal = vaInicial * (1 + taxaJuros).pow(periodo)
        return valorFinal
    }

    valorFinal = calcularInvestimento(valorInicial,taxaJuros, periodo)
    println("Valor final do investimento: R$${df.format(valorFinal)} ")
}