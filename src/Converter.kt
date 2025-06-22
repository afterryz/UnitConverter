package unitconverter

object Converter {
    fun cToF (celsius: Double): Double {
        val result = celsius * 9.0/5.0 + 32.0
        return result
    }

    fun fToC(fahrenheit: Double): Double {
        val result = (fahrenheit - 32.0) * 5.0/9.0
        return result
    }

    fun kgToLb(kg: Double): Double {
        val result = kg * 2.20462
        return result
    }

    fun lbToKg(lb: Double): Double {
        val result = lb / 2.20462
        return result
    }

    fun kmToMi(km: Double): Double {
        val result = km * 0.621371
        return result
    }

    fun miToKm(mi: Double): Double {
        val result = mi / 0.621371
        return result
    }
}