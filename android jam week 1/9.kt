fun main() {

    val num = 100
    var sum = 0

    for (i in 1..num) {
        if (i % 2 == 0)
        { sum += i }
    }

    println("Sum of even numbers from 1 to $num = $sum")
}