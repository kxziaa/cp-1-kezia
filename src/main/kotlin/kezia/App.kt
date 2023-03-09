/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package kezia

class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {

    val test = readLine()!!.toInt()
    repeat(test) {
        val number = readLine()!!.toInt()
        val result = if(isPrime(number)) "Prime Number" else "Not Prime"
        println("Case #${it+1}: $result ")
    }

}

fun isPrime(number: Int , i: Int=2): Boolean{
    if( number < 2)
        return false
    if(number % i == 0)
        return false
    if(i * i > number)
        return true

    return isPrime(number, i+1)
}

//
//fun isPrime(number: Int):Boolean {
//
//    for (i in 2..number / 2) {
//        if (number % i == 0) {
//            return false
//        }
//    }
//    return true
//
//}




