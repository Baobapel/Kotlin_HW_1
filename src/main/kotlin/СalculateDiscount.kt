fun main() {
    var discount = 0.0
    var onepercent = 0.01
    var fivepercent = 0.05
    val isRegularCustomer = true
    val purchaseAmount = 10200.0

    val simpleDiscount = purchaseAmount - when {
        purchaseAmount in 1000.0..10000.0 -> {
            discount += 100.0
            100.0
        }

        purchaseAmount >= 10001.0 -> {
            discount += (purchaseAmount * fivepercent)
            (purchaseAmount * fivepercent)
        }

        else -> {
            purchaseAmount
        }

    }

    val amountAfterDiscount = purchaseAmount - discount * onepercent

    println("Покупка - $purchaseAmount рублей")

    when {
        discount == 0.00 -> println("Скидок нет!")
        purchaseAmount in 1000.0 ..10000.0 -> println("Скидка составила 100 рублей. Сумма составила $simpleDiscount")
        purchaseAmount >= 10001.0 -> println("После применения 5% скидки — скидка составила $discount рублей.")
        isRegularCustomer -> println("Вы постоянный клиент. После применения 1% скидки — $amountAfterDiscount рублей.")
    }
}









