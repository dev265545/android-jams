import kotlin.math.pow

fun main() {
    val number = 163455
    var remainder: Int
    var result = 0
    var n = 0

    var temp: Int = number

    while (temp != 0) {
        temp /= 10
        ++n
    }

    temp = number

    while (temp != 0) {
        remainder = temp % 10
        result += remainder.toDouble().pow(n.toDouble()).toInt()
        temp /= 10
    }

    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}