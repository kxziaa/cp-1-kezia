package kezia.CP4

fun main() {
    val test = readLine()!!.toInt()
    val inputList = mutableListOf<String>()
    repeat(test) {
        val n = readLine()!!
        inputList.add(n)
    }
    val outputList = inputList.map {
        val b1 = it.toInt().toString(2).count { ch -> ch == '1' }
        val b2 = it.toInt(16).toString(2).count { ch -> ch == '1' }
        "$b1 $b2"
    }
    println(outputList.joinToString("\n"))
}