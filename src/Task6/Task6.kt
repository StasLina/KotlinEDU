package Task6

import  CommonInterfaces.ITask
import Task6.AbstractClass.Example as AbstractExample
import Task6.Interfacr.Example as InterfacrExample

class Task6 : ITask {
    public override fun run() {
        while (true) {
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Абстрактные классы")
            println("2 - Интерфейсы")

            val inputText = readln()
            if (inputText.isEmpty()) {
                continue
            }
            val inputNumber = inputText?.toInt()

            var instance: ITask? = null;
            if (inputNumber != null) {
                when (inputNumber) {
                    1 -> instance = AbstractExample()
                    2 -> instance = InterfacrExample()
                    0 -> break;
                    else -> println("Я вас не понимаю")
                }
                if (instance != null) {
                    instance.run()
                }
            }
        }
    }
}