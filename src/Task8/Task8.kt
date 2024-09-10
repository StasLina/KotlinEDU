package Task8

import java.util.Scanner
import  CommonInterfaces.ITask

class Task8 : ITask {

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

    private fun variant2() {
        while (true) {
            println("Введите цифру обозначающую тематику приложения")
            println("1 - оператор if")
            println("2 - оператор безопасного вызова ?")
            println("3 - функция let")
            println("4 - Элвис-оператор ?: ")
            println("0 - Выход")

            val inputText = readln()
            if (inputText.isEmpty()) {
                continue
            }
            val inputNumber = inputText?.toInt()

            if (inputNumber != null) {
                when (inputNumber) {
                    1 -> variant2_1()
                    2 -> variant2_2()
                    3 -> variant2_3()
                    4 -> variant2_4()
                    0 -> break;
                    else -> println("Я вас не понимаю")
                }
            }
        }
    }

    fun variant2_1() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            if (word != null) {
                println(word.uppercase())
            } else {
                println("empty")
            }
        }
    }

    fun variant2_2() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            println(word?.uppercase() ?: "empty")
        }
    }

    fun variant2_3() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            word?.let {
                println(it.uppercase())
            } ?: println("empty")
        }
    }

    fun variant2_4() {
        val words: List<String?> = listOf("hello", null, "world", "kotlin", null)

        for (word in words) {
            println((word ?: "empty").uppercase())
        }
    }

    public override fun run() {
        while (true) {
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Калькулятор")
            println("2 - Варианты перебора")
            println("0 - Выход")

            val inputText = readln()
            if (inputText.isEmpty()) {
                continue
            }
            val inputNumber = inputText?.toInt()

            if (inputNumber != null) {
                when (inputNumber) {
                    1 -> variant1()
                    2 -> variant2()
                    0 -> break;
                    else -> println("Я вас не понимаю")
                }
            }
        }
    }

}