import kotlin.math.roundToInt

fun main() {
    val amount = 10254
    val сommissionСoefficient = 0.0075
    val minCommission = 35
    val commission = amount * сommissionСoefficient
    val finalCommission = if (commission >= minCommission) commission.roundToInt() else minCommission
    println("Вы перевели $amount рублей и заплатили комиссию $finalCommission рублей.")
}