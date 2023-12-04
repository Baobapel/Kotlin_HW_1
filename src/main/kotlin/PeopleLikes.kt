
fun main() {
    val likes = 21
    val lastDigit = likes % 10
    when {
        lastDigit == 1 && likes != 11 -> println("Понравилось $likes человеку")
        likes == 11 -> println("Понравилось $likes людям")
        else -> println("Понравилось $likes людям")
    }
}
