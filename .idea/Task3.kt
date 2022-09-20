fun main() {
    val n = 10

    val list = MutableList(n) {0}
    (0 until n).forEach { list[it] = it + 1 }

    println(list)
}