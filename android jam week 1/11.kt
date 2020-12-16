import kotlin.math.pow//for using pow

fun main() {
    val number = 888
    var remainder: Int
    var result = 0

    var temp: Int = number//storing this number in temporary var gor calc purposes

    while (temp != 0) {
        remainder = temp % 10
        result += remainder.toDouble().pow(3.0).toInt()
        temp /= 10
    }

    if (result == number)
        println("$number is an Armstrong number.")
    else
        println("$number is not an Armstrong number.")
}