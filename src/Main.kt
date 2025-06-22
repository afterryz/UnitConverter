package unitconverter

fun main() {
    println("=== Unit Converter ===")
    loop@ while (true) {
        println("1) Температура (C ↔ F)")
        println("2) Вес (kg ↔ lb)")
        println("3) Расстояние (km ↔ mi)")
        println("0) Выход")

        when (InputUtils.readOption()) {
            1 -> convertTemperature()
            2 -> convertWeight()
            3 -> convertDistance()
            0 -> break@loop
            else -> println("Неверный выбор, попробуйте снова.")
        }

        print("Ещё одну операцию? (Y/N): ")
        val again = readlnOrNull()?.trim()?.lowercase()
        if (again != "y") break@loop
        println()
    }
    println("До встречи!")
}

private fun convertTemperature() {
    val input = InputUtils.readValueAndUnit() ?: run {
        println("Неверный формат ввода.")
        return
    }
    val (value, unit) = input
    when (unit.uppercase()) {
        "C" -> println("$value C = ${Converter.cToF(value).round(2)} F")
        "F" -> println("$value F = ${Converter.fToC(value).round(2)} C")
        else -> println("Неподдерживаемая единица для температуры: $unit")
    }
}

private fun convertWeight() {
    val input = InputUtils.readValueAndUnit() ?: run {
        println("Неверный формат ввода.")
        return
    }
    val (value, unit) = input
    when (unit.lowercase()) {
        "kg" -> println("$value kg = ${Converter.kgToLb(value).round(2)} lb")
        "lb" -> println("$value lb = ${Converter.lbToKg(value).round(2)} kg")
        else -> println("Неподдерживаемая единица для веса: $unit")
    }
}

private fun convertDistance() {
    val input = InputUtils.readValueAndUnit() ?: run {
        println("Неверный формат ввода.")
        return
    }
    val (value, unit) = input
    when (unit.lowercase()) {
        "km" -> println("$value km = ${Converter.kmToMi(value).round(2)} mi")
        "mi" -> println("$value mi = ${Converter.miToKm(value).round(2)} km")
        else -> println("Неподдерживаемая единица для расстояния: $unit")
    }
}
