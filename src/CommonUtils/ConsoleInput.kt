package CommonUtils

class ConsoleInput {
    companion object {
        fun readDoublePrompt(): Double {
            while (true) {
                val input = readLine()
                val number = input?.toDoubleOrNull()
                if (number != null) {
                    return number
                } else {
                    println("Введено некорректное значение. Попробуйте снова.")
                }
            }
        }
    }
}
