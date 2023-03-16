package kezia.CP1

data class ArrayOfNumchar( val index: Int, val value: Char)

fun main() {
    val numchar = arrayOf(
        ArrayOfNumchar(5, 'E'),
        ArrayOfNumchar(4, 'D'),
        ArrayOfNumchar(3, 'C'),
        ArrayOfNumchar(2, 'B'),
        ArrayOfNumchar(1, 'A')
    )

    val sortedNumchar = numchar.sortedBy { it.index }

    for (ArrayOfNumchar in sortedNumchar) {
        println("${ArrayOfNumchar.index}. ${ArrayOfNumchar.value}")
    }
}