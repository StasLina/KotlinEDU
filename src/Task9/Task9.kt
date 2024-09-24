package Task9
import  CommonInterfaces.ITask

class Task9 : ITask{

    private fun variant1() {
        val numbers = listOf(1, -5, 3, -8, 4, -2, 7)
        val negativeNumbers = numbers.filter { it < 0 }
        println(negativeNumbers)  // Вывод: [-5, -8, -2]
    }

    private fun variant2() {
        val numbers = listOf(1, -5, 3, -8, 4, -2, 7)
        val invertedNumbers = numbers.map { if (it > 0) -it else it }
        println(invertedNumbers)  // Вывод: [-1, -5, -3, -8, -4, -2, -7]
    }

    private fun variant3(){
        val numbers = listOf(1, 2, 3, 4, 5)
        val squares = numbers.map { it * it }
        println(squares)  // Вывод: [1, 4, 9, 16, 25]
    }

    private fun variant4(){
        val numbers = (1..7).toList()
        val result = numbers.joinToString(separator = "+", prefix = "=", postfix = "=")
        println(result)  // Вывод: =1+2+3+4+5+6+7=
    }

    private fun  variant5(){
        val phoneBook = mapOf("Alice" to "+123456789", "Bob" to "+789654321", "Charlie" to "+123987654")
        val countryCode = "+123"

        val filteredPhoneBook = phoneBook.filter { it.value.startsWith(countryCode) }
        println(filteredPhoneBook)  // Вывод: {Alice=+123456789, Charlie=+123987654}
    }

    private fun variant6() {
        val ones = listOf("ноль", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
        val teens = listOf("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
        val tens = listOf("", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто")

        fun numberToWords(num: Int): String {
            return when {
                num in 0..9 -> ones[num]
                num in 10..19 -> teens[num - 10]
                num in 20..99 -> tens[num / 10] + (if (num % 10 != 0) " " + ones[num % 10] else "")
                else -> "Число вне диапазона"
            }
        }

        val input = 27
        println(numberToWords(input))  // Вывод: двадцать семь
    }
    private fun variant7(){
        val timeString = "01:20:12"
        val timeParts = timeString.split(":").map { it.toInt() }

        val hoursInSeconds = timeParts[0] * 3600
        val minutesInSeconds = timeParts[1] * 60
        val seconds = timeParts[2]

        val totalSeconds = hoursInSeconds + minutesInSeconds + seconds
        println(totalSeconds)
    }

    public override fun run() {
        while (true) {
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Выделение отрицательных чисел")
            println("2 - Преобразование коллекций")
            println("3 - Сформировать новый список их квадратов")
            println("4 - IntRange")
            println("5 - countryCode")
            println("6 - Преобразование цифр в текст")
            println("7 - Split")
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
                    3 -> variant3()
                    4 -> variant4()
                    5 -> variant5()
                    6 -> variant6()
                    7 -> variant7()
                    0 -> break;
                    else -> println("Я вас не понимаю")
                }
            }
        }
    }

}