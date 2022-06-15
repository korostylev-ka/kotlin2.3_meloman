fun main() {
    //переменная стоимости покупки
    val amount = 1005
    //переменная на проверку принадлежности к "меломанам"
    val isMeloman = true
    //переменная для величины скидки в зависимости от суммы покупки
    var userDiscount = when (amount) {
        in 0..1_000 -> amount.toDouble()
        in 1001..10_000 -> (amount - 100).toDouble()
        else -> amount - amount * 0.05
    }
    //итоговая скидка, если меломан
    var totalAmount = if (isMeloman == true) userDiscount - userDiscount * 0.01  else userDiscount
    println("Сумма покупки без скидки равна $amount руб. Итоговая сумма с учетом скидок составила $totalAmount руб.")
}