package Task8

import java.util.Scanner
class Task8 {

    private fun variant1() {
        val scanner = Scanner(System.`in`)

        // Ввод данных
        print("Введите первое число: ")
        val num1 = scanner.nextDouble()
        print("Введите второе число: ")
        val num2 = scanner.nextDouble()
        print("Введите знак операции (+, -, *, /): ")
        val operation = scanner.next()

        // Выполнение операции
        val result = when (operation) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> {
                if (num2 == 0.0) {
                    println("Ошибка: Деление на ноль.")
                    return
                }
                num1 / num2
            }

            else -> {
                println("Ошибка: Неизвестная операция.")
                return
            }
        }

        // Вывод результата
        println("Результат: $result")
    }

    private fun variant2(){

    }

    fun variant2_1() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            if (word != null) {
                println(word.toUpperCase())
            } else {
                println("empty")
            }
        }
    }
    fun variant2_2() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            println(word?.toUpperCase() ?: "empty")
        }
    }
    fun variant2_3() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            word?.let {
                println(it.toUpperCase())
            } ?: println("empty")
        }
    }
    fun variant2_4() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            println((word ?: "empty").toUpperCase())
        }
    }


}