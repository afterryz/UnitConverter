package unitconverter

import kotlin.math.pow
import kotlin.math.round

fun Double.round(decimals: Int): Double {
    val factor = 10.0.pow(decimals)
    return round(this * factor) / factor
}