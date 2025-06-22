package unitconverter

object InputUtils {
    fun readOption(): Int {
        print("Выберите опцию [0–3]: ")
        val line = readlnOrNull()?.trim()
        return line?.toIntOrNull() ?: -1
    }

    fun readValueAndUnit(): Pair<Double, String>? {
        print("Введите значение и единицу (например: 36.6 C): ")
        val input = readlnOrNull() ?: return null
        val parts = input.trim().split(" ")
        if (parts.size != 2) return null
        val value = parts[0].toDoubleOrNull() ?: return null
        val unit = parts[1]
        return Pair(value, unit)
    }
}