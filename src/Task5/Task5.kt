package Task5

import  CommonInterfaces.ITask

class Task5 : ITask {
    // Определение суперкласса Vehicle
    open class Vehicle(
        var speed: Int = 0,     // Скорость транспортного средства
        var name: String = ""   // Название транспортного средства
    ) {
        // Метод для начала движения
        open fun start() {
            println("$name начал движение со скоростью $speed км/ч")
        }

        // Метод для остановки
        open fun stop() {
            println("$name остановился")
        }
    }

    class Boat(
        speed: Int = 0,
        name: String = "Лодка"
    ) : Vehicle(speed, name) {
        // Переопределение метода start для лодки
        override fun start() {
            println("$name начала движение по воде со скоростью $speed км/ч")
        }

        // Переопределение метода stop для лодки
        override fun stop() {
            println("$name остановилась на воде")
        }
    }

    class Plane(
        speed: Int = 0,
        name: String = "Самолет"
    ) : Vehicle(speed, name) {
        // Переопределение метода start для самолета
        override fun start() {
            println("$name начал взлет со скоростью $speed км/ч")
        }

        // Переопределение метода stop для самолета
        override fun stop() {
            println("$name приземлился")
        }
    }

    class Tank(
        speed: Int = 0,
        name: String = "Танк"
    ) : Vehicle(speed, name) {
        // Переопределение метода start для танка
        override fun start() {
            println("$name начал движение по земле со скоростью $speed км/ч")
        }

        // Переопределение метода stop для танка
        override fun stop() {
            println("$name остановился")
        }
    }

    public override fun run(){
        val boat = Boat(speed = 60, name = "Рыбацкая лодка")
        val plane = Plane(speed = 800, name = "Боинг 747")
        val tank = Tank(speed = 40, name = "Т-90")

        boat.start()
        boat.stop()

        plane.start()
        plane.stop()

        tank.start()
        tank.stop()
    }

}