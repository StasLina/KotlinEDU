package Task7

import CommonInterfaces.ITask
import Task6.AbstractClass.Example

class Task7 : ITask {

    fun variant1() {
        fun printInfoOfCars(obj1: Car, obj2: Car) {
            println("==: ${obj1 == obj2}\n===: ${obj1 == obj2}")
            println("Хэшкод car1: ${obj1.hashCode()}\nХэшкод car2: ${obj2.hashCode()}")
            println("car1: ${obj1.name}\ncar2: ${obj2.name}")
        }

        fun printInfoOfVehicles(obj1: Vehicle, obj2: Vehicle) {
            println("==: ${obj1 == obj2}\n===: ${obj1 == obj2}")
            println("Хэшкод vehicle1: ${obj1.hashCode()}\nХэшкод vehicle2: ${obj2.hashCode()}")
            println("vehicle1: ${obj1.name}\nvehicle2: ${obj2.name}")
        }

        val car1 = Car("Lada", 100)
        val car2 = Car("Lada", 100)

        printInfoOfCars(car1, car2)

        val car3 = car1;
        printInfoOfCars(car1, car3)

        car3.name = "Belaz";
        println("car1: ${car1.name}\ncar3: ${car3.name}")

        val vehicle1 = Vehicle("Ural", 100)
        val vehicle2 = Vehicle("Ural", 100)

        printInfoOfVehicles(vehicle1, vehicle2)

        val vehicle3 = vehicle1.copy("ZIL")
        val vehicle4 = vehicle1.copy()

        printInfoOfVehicles(vehicle3, vehicle1)
        printInfoOfVehicles(vehicle4, vehicle1)
    }

    fun variant2() {
        val point = Point(0, 0)
        val turtle = Turtle()

        println(point)

        turtle.move(point, Command.UP)
        println(point)

        turtle.move(point, Command.RIGHT)
        println(point)

        turtle.move(point, Command.DOWN)
        println(point)

        turtle.move(point, Command.LEFT)
        println(point)
    }

    class Car(var name: String, var speed: Int) {
    }

    data class Vehicle(var name: String, var speed: Int) {
    }

    class Point(var x: Int, var y: Int) {
        override fun toString(): String {
            return "Текущие координаты: x = $x, y = $y"
        }
    }

    enum class Command {
        UP, DOWN, LEFT, RIGHT
    }

    class Turtle {
        fun move(point: Point, command: Command) {
            when (command) {
                Command.UP -> {
                    point.y++
                    println("Произведено перемещение по оси Y на +1, по оси X на 0")
                }

                Command.DOWN -> {
                    point.y--
                    println("Произведено перемещение по оси Y на -1, по оси X на 0")
                }

                Command.LEFT -> {
                    point.x--
                    println("Произведено перемещение по оси X на -1, по оси Y на 0")
                }

                Command.RIGHT -> {
                    point.x++
                    println("Произведено перемещение по оси X на +1, по оси Y на 0")
                }
            }
        }
    }

    public override fun run() {
        while (true) {
            println("Введите цифру обозначающую тематику приложения")
            println("1 - Вычисление хэш кода")
            println("2 - Джижение машинки")
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