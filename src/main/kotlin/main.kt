const val percent: Double = 0.0075
const val minCommission: Int = 3500

fun main() {
    var amount: Int = 25_000_00
    val finalAmount =
        if ((amount * percent).toInt() <= minCommission) (amount + minCommission) else (amount * 1.0075).toInt()
    println("Комиссия за перевод составит ${(finalAmount / 100).toInt()} рублей ${finalAmount % 100} копеек")
}