fun main() {

    val x = 0

    when {
        x < 0.0 -> {
            println("$x is a negative number.")
        }
        x > 0.0 -> println("$x is a positive number.")
        else -> println("x is 0.")
    }
}
