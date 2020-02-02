import kotlin.math.max
import kotlin.math.min

fun maxProfit(prices: IntArray): Int {
    var price = Int.MAX_VALUE
    var profit = 0
    prices.forEach {
        price = min(it, price)
        profit = max(it - price, profit)
    }
    return profit
}
