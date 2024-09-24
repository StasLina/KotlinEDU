import  CommonInterfaces.ITask
import Task0.Task0
import Task2.Task2
import Task3.Task3
import Task4.Task4
import Task5.Task5
import Task6.Task6
import Task7.Task7
import Task8.Task8
import Task9.Task9

class TaskManager : ITask {
    public override fun run() {

        while (true) {
            println("Введите цифру обозначающую № задания")
            println("1 - Не теряя времени")
            println("2 - Из жизни переменных")
            println("3 - За пределами main")
            println("4 - Высокий класс")
            println("5 - Наследование")
            println("6 - Серьёзно о полиморфизме")
            println("7 - Работа с данными")
            println("8 - В целостности и сохранности")
            println("9 - Порядок превыше всего")
            println("0 - Выход")

            val inputText = readln()
            if (inputText.isEmpty()) {
                continue
            }

            val inputNumber = inputText?.toInt()

            var instanceTask: ITask? = null

            if (inputNumber != null)
                when (inputNumber) {
                    1 -> instanceTask = Task0()
                    2 -> instanceTask = Task2()
                    3 ->  instanceTask = Task3()
                    4 ->  instanceTask = Task4()
                    5 ->  instanceTask = Task5()
                    6 ->  instanceTask = Task6()
                    7 -> instanceTask = Task7()
                    8 -> instanceTask = Task8()
                    8 -> instanceTask = Task9()
                    0 -> return

                    else -> println("Я вас не понимаю")
                }
            if (instanceTask != null) {
                instanceTask.run()
            }
        }
    }
}

fun main(args: Array<String>) {
    val taskManager : ITask = TaskManager()
    taskManager.run()
}