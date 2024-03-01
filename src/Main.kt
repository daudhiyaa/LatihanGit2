import kotlin.math.PI
import kotlin.math.sqrt

class Triangle(private val side1: Double, private val side2: Double, private val side3: Double) {

    fun calculateArea(): Double {
        // Heron's formula for area of a triangle
        val s = (side1 + side2 + side3) / 2
        return sqrt(s * (s - side1) * (s - side2) * (s - side3))
    }

    fun calculatePerimeter(): Double {
        return side1 + side2 + side3
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val triangle = Triangle(3.0, 4.0, 5.0)
            val area = triangle.calculateArea()
            val perimeter = triangle.calculatePerimeter()

            println("Area of the triangle: $area")
            println("Perimeter of the triangle: $perimeter")
        }
    }
}
class Circle {

    fun main() {
        val radius = 5.0

        // Menghitung luas lingkaran
        val area = calculateArea(radius)
        println("Luas lingkaran dengan radius $radius adalah $area")

        // Menghitung keliling lingkaran
        val circumference = calculateCircumference(radius)
        println("Keliling lingkaran dengan radius $radius adalah $circumference")
    }

    fun calculateArea(radius: Double): Double {
        return PI * radius * radius
    }

    fun calculateCircumference(radius: Double): Double {
        return 2 * PI * radius
    }
}

fun main() {
    // Membuat objek Circle
    val circle = Circle()

    // Memanggil fungsi main dari objek Circle
    circle.main()
}
