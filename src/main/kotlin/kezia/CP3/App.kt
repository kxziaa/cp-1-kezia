package kezia.CP3

import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val t = readLine()!!.toInt()

    for (i in 1..t) {
        print("N = ")
        val n = readLine()!!.toInt()
        val matrix = Array(n) { LongArray(n) }
        var isSymmetric = true

        for (j in 0 until n) {
            for (k in 0 until n) {
                matrix[j][k] = input.nextLong()
            }
        }


        for (j in 0 until n) {
            for (k in 0 until n) {
                if (matrix[j][k] < 0 || matrix[j][k] != matrix[n - j - 1][n - k - 1]) {
                    isSymmetric = false
                    break
                }
            }
            if (!isSymmetric) {
                break
            }
        }

        if (isSymmetric) {
            println("Test $i: Symmetric")
        } else {
            println("Test $i: Non-symmetric")
        }
    }
}


//fun main() {
//
//    print("How many case? ")
//    val num = readLine()!!.toInt()
//    repeat(num)
//    { print("N =")
//    val n = readLine()!!.toInt()
//    val mat = Array(n) {IntArray(n)}
//    for (i in 0 until n){
//        for (j in 0 until n){
//            mat[i][j] = readLine()!!.toInt()
//        }
//    }
//
//    var isSymmetric = true
//    for (i in 0 until n){
//        for (j in 0 until n){
//           if (mat[i][j] != mat[j][i]){
//               isSymmetric = false;
//               break
//           }
//        }
//    }
//
//    if (isSymmetric) {
//        println("Symmetric")
//    }
//    else {
//        println(" Not symmetric")
//    } }
//}
