package Task3

import kotlin.math.sqrt
import  CommonInterfaces.ITask
import CommonUtils.ConsoleInput

class Task3 : ITask {
    private fun sqr(n: Double): Double {
        return n * n
    }

    private fun discriminant(a: Double, b: Double, c: Double): Double {
        return b * b - 4 * a * c
    }

    private fun rootsNumber(a: Double, b: Double, c: Double): Int {
        val disc = discriminant(a, b, c)
        return when {
            disc > 0 -> 2 // Два корня
            disc == 0.0 -> 1 // Один корень
            else -> 0 // Нет корней
        }
    }

    private fun quadraticRoot(a: Double, b: Double, c: Double) {
        val disc = discriminant(a, b, c)
        when (rootsNumber(a, b, c)) {
            2 -> {
                val root1 = (-b + sqrt(disc)) / (2 * a)
                val root2 = (-b - sqrt(disc)) / (2 * a)
                println("Корни уравнения: x1 = $root1, x2 = $root2")
            }

            1 -> {
                val root = -b / (2 * a)
                println("Единственный корень уравнения: x = $root")
            }

            0 -> {
                println("Нет действительных корней.")
            }
        }
    }

    private fun variant1() {
        println("Введите число")
        val sqrtValue = ConsoleInput.readDoublePrompt()
        println("Квадрат числа ${sqr(sqrtValue)}: ${sqr(sqrtValue)}")
    }

    private fun variant2() {
        println("Введите коэффициент a")
        val a = ConsoleInput.readDoublePrompt()
        println("Введите коэффициент b")
        val b = ConsoleInput.readDoublePrompt()
        println("Введите коэффициент c")
        val c = ConsoleInput.readDoublePrompt()

        println("Дискриминант уравнения: ${discriminant(a, b, c)}")
        println("Количество корней: ${rootsNumber(a, b, c)}")
        quadraticRoot(a, b, c)
    }
    public override fun run() {
        while(true){
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Вычисление квадрата числа")
            println("2 - Расчёт параметров квадратного уравнения")

            val inputText = readln()
            if(inputText.isEmpty()){
                continue
            }
            val inputNumber = inputText?.toInt()

            if (inputNumber != null)
                when (inputNumber) {
                    1 -> variant1()
                    2 -> variant2()
                    0 -> break;
                    else -> println("Я вас не понимаю")
                }
        }
    }



}