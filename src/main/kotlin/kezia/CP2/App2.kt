package kezia.CP2

fun main(){
    do {
        print("Enter number: ")
        val num = readLine()!!.toInt()
        if ( num !=0) {

            if (num % 11 == 0)
                println("$num is a multiple of 11")
            else
                println("$num is not a multiple of 11")
        }
    }
        while ( num != 0)
}