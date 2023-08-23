import java.util.*
import kotlin.math.roundToLong

fun main() {
    val scanner = Scanner(System.`in`).useLocale(Locale.US)
    val valor = scanner.nextDouble()

    if (valor > 0) {
        val valorFormatt = String.format("%.2f", valor)
        println("Deposito realizado com sucesso!\nSaldo atual: R$ ${valorFormatt}")
    } else if (valor == 0.0) {
        println("Encerrando o programa...")
    } else {
        println("Valor invalido! Digite um valor maior que zero.")
    }
}
