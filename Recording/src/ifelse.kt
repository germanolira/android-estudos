fun maiorDeIdade(idade: Int) {
  if (idade >= 18) {
    println("Maior de idade!")
  } else {
    println("Menor de idade")
  }
}

fun main() {
  maiorDeIdade(10)
  maiorDeIdade(18)
  maiorDeIdade(150)
}