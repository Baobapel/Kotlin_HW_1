fun main() {
    val likes = 154615611
    val lastWord = when {
        likes == 1 || (likes % 10 == 1 && likes % 100 != 11) -> "человеку"
        else -> "людям"
    }

    println("Понравилось $likes $lastWord")
}
