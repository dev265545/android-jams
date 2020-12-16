fun main() {
    print("Write the first side   ")

    val a = Integer.valueOf(readLine())

    print("Write the second side  ")
    val b = Integer.valueOf(readLine())
    print("Write4 the third side    ")
    val c = Integer.valueOf(readLine())
        if (a == b && b == c && a == c) {
            println("the triangle with sides $a, $b, $c, is an equilateral triangle ")
        } else {
            if (!(a != b && b != c && a != c)) {
                println("the triangle is an isosceles triangle ")
            } else if (!(a == b || a == c)) {
                println("the triangle is an scalene triangle ")
            }
        }


}

