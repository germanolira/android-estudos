fun calculaBonus(cargo: String, salario: Float): Float {
  // Gerente Junior, Gerente Senior, Coordenador

  return if (cargo == "Coordenador") {
    salario * 1.2f
  } else if (cargo == "Gerente Junior") {
    salario * 1.15f
  } else {
    salario * 2
  }
}

fun main() {
  println(calculaBonus("Gerente Senior", 1000f))
}