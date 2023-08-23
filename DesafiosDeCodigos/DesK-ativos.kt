import java.text.DecimalFormat
import kotlin.math.pow

fun calcularValorFinalInvestimento(valorInicial: Double, taxaJuros: Double, periodo: Int): Double {
    val valorFinal = valorInicial * (1 + taxaJuros).pow(periodo)
    return valorFinal
}

fun main() {
    val df = DecimalFormat("#.00") // Formatação para duas casas decimais

    val valorInicial = 5000.0
    val taxaJuros = 0.08
    val periodo = 5

    val valorFinal = calcularValorFinalInvestimento(valorInicial, taxaJuros, periodo)

    println("Valor final do investimento: R$ ${df.format(valorFinal)}")
}

