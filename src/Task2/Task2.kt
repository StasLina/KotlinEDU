package Task2
import kotlin.math.min;
import kotlin.math.max;
import  CommonInterfaces.ITask

class Task2 : ITask {
    fun variant1() {
        print("Введите количество простых чисел (n): ")
        val n = readln().toInt()

        var count = 0
        var number = 2

        while (count < n) {
            if (isPrime(number)) {
                count++
                println("${count}-е число: $number")
            }
            number++
        }
    }

    fun variant2() {
        val nums: IntArray = intArrayOf(1, 5, 3, 7, 2, 9, 4)

        print("Использование цикла for:\n")
        for (i in 1 until nums.size - 1) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                print("${nums[i]} ")
            }
        }
        println()

        print("Использование цикла while:\n")
        var i = 1
        while (i < nums.size - 1) {
            if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
                print("${nums[i]} ")
            }
            i++
        }
        println()

        print("Использование оператора forEach:\n")
        nums.forEachIndexed { index, element ->
            if (index in 1 until nums.size - 1 && element > nums[index - 1] && element > nums[index + 1]) {
                print("$element ")
            }
        }
        println()
    }

    fun variant3(){
        val array = intArrayOf(2, 5, 1, 8, 3)

        // Цикл for
        var productFor = 1
        var minFor = array[0]
        var maxFor = array[0]
        for (i in array.indices) {
            productFor *= array[i]
            minFor = min(minFor, array[i])
            maxFor = max(maxFor, array[i])
        }
        println("Цикл for: Произведение = $productFor, min = $minFor, max = $maxFor")

        // Цикл while
        var productWhile = 1
        var minWhile = array[0]
        var maxWhile = array[0]
        var i = 0
        while (i < array.size) {
            productWhile *= array[i]
            minWhile = min(minWhile, array[i])
            maxWhile = max(maxWhile, array[i])
            i++
        }
        println("Цикл while: Произведение = $productWhile, min = $minWhile, max = $maxWhile")

        // Функция reduce()
        val productReduce = array.reduce { acc, element -> acc * element }
        val minReduce = array.reduce { acc, element -> min(acc, element) }
        val maxReduce = array.reduce { acc, element -> maxOf(acc, element) }
        println("Функция reduce(): Произведение = $productReduce, min = $minReduce, max = $maxReduce")

        // Оператор forEach
        var productForEach = 1
        var minForEach = array[0]
        var maxForEach = array[0]
        array.forEach { element ->
            productForEach *= element
            minForEach = min(minForEach, element)
            maxForEach = max(maxForEach, element)
        }
        println("Оператор forEach: Произведение = $productForEach, min = $minForEach, max = $maxForEach")

        // Функции min() и max()

        val min = array.minOrNull() ?: 0 // Используем minOrNull() для обработки случая пустого массива
        val max = array.maxOrNull() ?: 0 // Используем maxOrNull() для обработки случая пустого массива
        println("Функции min() и max(): min = $min, max = $max")
    }

    fun isPrime(num: Int): Boolean {
        if (num <= 1) return false
        for (i in 2..Math.sqrt(num.toDouble()).toInt()) {
            if (num % i == 0) return false
        }
        return true
    }

    public override fun run() {
        while(true){
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Вывод простых чисел начинающихся с 2")
            println("2 - Вывод элементов массива больше соседнего")
            println("3 - Вывод  произведение элементов этого массива, найдите min и max элементов")
            println("0 - Выход")

            val inputText = readln()
            if(inputText.isEmpty()){
                continue
            }
            val inputNumber = inputText?.toInt()

            if (inputNumber != null)
                when (inputNumber) {
                    1 -> variant1()
                    2 -> variant2()
                    3 -> variant3()
                    0 -> break;
                    else -> println("Я вас не понимаю")
                }
        }
    }



}