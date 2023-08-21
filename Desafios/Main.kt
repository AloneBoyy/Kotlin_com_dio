enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String) // Adicionando a propriedade nome ao Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario) // Adicionando o usuário à lista de inscritos
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Estruturas de Dados", 120)

    val formacao1 = Formacao("Formação em Kotlin", listOf(conteudo1, conteudo2))

    val usuario1 = Usuario("Martim")
    val usuario2 = Usuario("Ana")

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    println("${formacao1.inscritos.size} inscritos na formação ${formacao1.nome}:")
    for (inscrito in formacao1.inscritos) {
        println("- ${inscrito.nome}")
    }
}
