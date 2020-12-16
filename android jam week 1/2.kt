fun main() {

    val num1 = 4
    val num2 = 5
    val num3 = 7.2

    when {
        num1 >= num2 && num1 >= num3 -> println("$num1 is the largest number.")
        num2 >= num1 && num2 >= num3 -> println("$num2 is the largest number.")
        else -> println("$num3 is the largest number.")
    }
}