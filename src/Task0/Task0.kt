package Task0
import  CommonInterfaces.ITask

class Task0 : ITask{
    private fun variant1(): Int {
        // Ввод числа с клавиатуры
        print("Введите целое положительное число: ")
        val input = readln() // Считываем строку

        // Проверяем, что ввод не пустой и содержит только цифры
        if (input.isNotEmpty() && input.all { it.isDigit() }) {
            // Получаем первую и последнюю цифры
            val firstChar = input.first() // Первый символ
            val lastChar = input.last()   // Последний символ

            // Преобразуем символы в цифры
            val firstDigit = Character.getNumericValue(firstChar)
            val lastDigit = Character.getNumericValue(lastChar)

            // Вычисляем сумму
            val sum = firstDigit + lastDigit

            // Выводим результат
            println("Сумма первой и последней цифры: $sum")
        } else {
            println("Ошибка: Введите корректное целое положительное число.")
            return 1;
        }

        return 0;
    }

    private fun variant2() : Int {
        var count = 0 // Количество введенных чисел
        var sum = 0   // Сумма введенных чисел

        while (true) {
            // Ввод числа с клавиатуры
            print("Введите число (введите 0 для завершения): ")
            val input = readln()

            // Преобразуем ввод в целое число
            val number = input.toInt()

            // Проверяем, не равно ли введенное число 0
            if (number == 0) {
                break
            }

            // Увеличиваем счетчик и добавляем число к сумме
            count++
            sum += number
        }

        // Вычисляем среднее арифметическое
        val average = if (count > 0) sum.toDouble() / count else 0.0

        // Выводим результаты
        println("Количество введенных чисел: $count")
        println("Сумма введенных чисел: $sum")
        println("Среднее арифметическое: $average")
        return 0;
    }

    private fun variant3() : Int {
        val randomNumber = (0..10).random()

        var guess: Int? = null

        // Информируем пользователя о начале игры
        println("Угадайте число от 0 до 10")

        // Цикл для ввода числа от пользователя до тех пор, пока не будет угадано
        while (guess != randomNumber) {
            // Ввод числа с клавиатуры
            print("Введите ваше число: ")
            guess = readLine()?.toIntOrNull()  // Преобразуем ввод в целое число

            if (guess == null) {
                println("Ошибка ввода. Пожалуйста, введите целое число.")
                continue
            }

            // Сравнение введенного числа с загаданным числом
            when {
                guess > randomNumber -> println("Много")
                guess < randomNumber -> println("Мало")
                else -> println("Угадал")
            }
        }
        return 0
    }

    public override fun run(){
        while(true){
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Счёт суммы крайних цифр числа")
            println("2 - Счёт среднего числа из ввдённых")
            println("3 - Угодай число")
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