import  CommonInterfaces.ITask
import Task0.Task0
import Task2.Task2

class TaskManager : ITask {
    public override fun run() {

        while (true) {
            println("Введите цифру обозначающую № задания")
            println("1 - Не теряя времени")
            println("2 - Из жизни переменных")

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
                    //3 ->  variant3()
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