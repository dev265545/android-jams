fun main() {
    var sum = 0
    val num = 4
    var i = 1
    while (i <= num) {
        var factorial = 1
        var j = 1
        while (j <= i) {
            factorial *= j
            j += 1
        }
        sum += factorial
        i += 1
    }
    println(" sum of factorials of $num = $sum")
}
