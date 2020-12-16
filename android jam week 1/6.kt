fun main() {

    val char = 'a'

    when {
        (char in 'a'..'z' || char in 'A'..'Z')
        -> println("$char is an alphabet.")
        else
        -> println("$char is not an alphabet.")
    }
}