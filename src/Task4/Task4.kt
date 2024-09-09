package Task4

import Task5.Task5
import  CommonInterfaces.ITask

class Task4 : ITask {

    public override fun run(){
        val boat = Task5.Boat(speed = 60, name = "Рыбацкая лодка")
        val plane = Task5.Plane(speed = 800, name = "Боинг 747")
        val tank = Task5.Tank(speed = 40, name = "Т-90")

        boat.start()
        boat.stop()

        plane.start()
        plane.stop()

        tank.start()
        tank.stop()
    }
}