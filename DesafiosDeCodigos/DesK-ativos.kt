fun main() {
    val ativos = mutableListOf<String>()

    // Entrada da quantidade de ativos
    val quantidadeAtivos = readLine()!!.toInt()

    // Entrada dos códigos dos ativos
    for (i in 1..quantidadeAtivos) {
        val codigoAtivo = readLine()!!
        ativos.add(codigoAtivo)
    }

    val ordemList = ativos.sorted()
    for (i in ordemList){
        println(i)
    }

}
