fun calculaBonus(a: Int, b: Int, c: Int) {
  println("O bônus é: ${a + b * c}")
}

fun main() {
  println("Testando")

  val nome: String = "Elon Musk"
  var idade: Int = 200
  println(nome)

  var y: Int
  var x: Int

  x = 10

  println(x)

  println("O $nome escolheu o número $x")
  println("O nome do $nome tem ${nome.length} digitos")

  val str = """
    testando
    os comentários
    de várias
    linhas
  """.trimIndent()
  println(str)

  val a = 10
  val b = 20
  val c = 30

  calculaBonus(a, b, c)
}