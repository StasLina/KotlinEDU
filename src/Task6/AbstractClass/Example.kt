package Task6.AbstractClass
import  CommonInterfaces.ITask

class Example : ITask{
    abstract class Figure {
        abstract fun area(): Double
        abstract fun perimeter(): Double
    }

    class Rectangle(private val width: Double, private val height: Double) : Figure() {
        override fun area(): Double {
            return width * height
        }

        override fun perimeter(): Double {
            return 2 * (width + height)
        }
    }

    class Circle(private val radius: Double) : Figure() {
        override fun area(): Double {
            return Math.PI * radius * radius
        }

        override fun perimeter(): Double {
            return 2 * Math.PI * radius
        }
    }

    class Triangle(private val a: Double, private val b: Double, private val c: Double) : Figure() {
        override fun area(): Double {
            // Используем формулу Герона для вычисления площади
            val s = (a + b + c) / 2
            return Math.sqrt(s * (s - a) * (s - b) * (s - c))
        }

        override fun perimeter(): Double {
            return a + b + c
        }
    }

    public override fun run(){
        val rectangle = Rectangle(5.0, 3.0)
        val circle = Circle(4.0)
        val triangle = Triangle(3.0, 4.0, 5.0)

        println("Прямоугольник: Площадь = ${rectangle.area()}, Периметр = ${rectangle.perimeter()}")
        println("Окружность: Площадь = ${circle.area()}, Периметр = ${circle.perimeter()}")
        println("Треугольник: Площадь = ${triangle.area()}, Периметр = ${triangle.perimeter()}")
    }
}