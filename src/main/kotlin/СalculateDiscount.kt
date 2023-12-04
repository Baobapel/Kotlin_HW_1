fun main() {
    var discount = 0.0
    val isRegularCustomer = false
    val purchaseAmount = 1200.0

    when {
        purchaseAmount in 1000.0..10000.0 -> {
            discount = 100.0
        }
    }

    val simpleDiscount = purchaseAmount - discount

    when {
        purchaseAmount >= 10001.0 -> {
            discount = purchaseAmount * 0.05
        }
    }

    val discountedAmount = purchaseAmount - discount

    if (isRegularCustomer) {
        val regularCustomerDiscount = discountedAmount * 0.01 // Применяем 1% скидку сверху
        discount += regularCustomerDiscount
    }
    val amountAfterDiscount = purchaseAmount - discount

    println("Покупка - $purchaseAmount рублей")
    if (discount == 0.00) println("Скидок нет!")
    if (purchaseAmount >= 1000.0 && purchaseAmount <= 10000.0) println("Скидка составила 100 рублей. Сумма составила $simpleDiscount")
    if (purchaseAmount >= 10001.0) println("После применения 5% скидки — $discountedAmount рублей.")
    if (isRegularCustomer) println("Вы постоянный клиент. После применения 1% скидки — $amountAfterDiscount рублей.")

}









