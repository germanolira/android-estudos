fun main() {

  // Nullable
  val test: Int? = null
  val op: Int = test ?: 100
  // Se existir valor em test, use o valor, caso contrário, use o valor 100

  println(op)
}