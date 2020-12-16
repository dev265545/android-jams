fun main() {

    val num = 19
    var factorial = 1
    for (i in 1..num) {
        factorial = factorial*i
    }
    println("Factorial of $num = $factorial")
}