import java.lang.IllegalArgumentException
import kotlin.math.sqrt

/*open class Account(s: Int = 0){

    var sum: Int = s
        private set

    open fun withdraw(amount: Int){
        sum -= amount
    }

    fun deposit(amount: Int){
        sum += amount
    }
}

val firstAccount: Account = Account()
firstAccount.deposit(100)
firstAccount.withdraw(50)
println("Sum from the first account = ${firstAccount.sum}")
firstAccount.withdraw(100)
println("Sum from the first account = ${firstAccount.sum}")

class SavingAccount(s: Int = 0): Account(s){

    override fun withdraw(amount: Int){
        if(sum - amount > 0)
            super.withdraw(amount)
    }
}

val savingAccount: SavingAccount = SavingAccount()
savingAccount.deposit(500)
savingAccount.withdraw(100)
println("Sum from savings account = ${savingAccount.sum}")
savingAccount.withdraw(500)
println("Sum from saving account = ${savingAccount.sum}")

fun degreeToCardinal(angle: Int) = when(angle) {
    0 -> "E"
    in 1..89 -> "NE"
    90 -> "N"
    in 91..179 -> "NW"
    180 -> "W"
    in 181..269 -> "SW"
    270 -> "S"
    in 271..359 -> "SE"
    else -> ""
}

println("Degrees to cardinal for 0 degrees = ${degreeToCardinal(0)}")
println("Degrees to cardinal for 56 degrees = ${degreeToCardinal(56)}")
println("Degrees to cardinal for 90 degrees = ${degreeToCardinal(90)}")
println("Degrees to cardinal for 137 degrees = ${degreeToCardinal(137)}")
println("Degrees to cardinal for 180 degrees = ${degreeToCardinal(180)}")
println("Degrees to cardinal for 200 degrees = ${degreeToCardinal(200)}")
println("Degrees to cardinal for 270 degrees = ${degreeToCardinal(270)}")
println("Degrees to cardinal for 300 degrees = ${degreeToCardinal(300)}")

fun String.getNumOfVowels() = this.toUpperCase().count {it in "AEIOU"}

println("Num of vowels in \"Hello, World\" = ${"Hello, Wolrd".getNumOfVowels()}")

class RectangularShape(var x: Int, var y: Int, var width: Int, var height: Int, var color: Int) {
    fun measure() {}
    fun render() {}

    override fun toString() =
        "RectangularShape(x=${x}, y=${y}, w=${width}, h=${height}, c=${color})"

}

fun validateShape(shape: RectangularShape) = when{
    shape.x < 0 || shape.y < 0 -> {
        print("Invalid shape")
        false
    }
    shape.width > 1024 || shape.height  > 1024 ->{
        print("Shape too big")
        false
    }
    shape.color < 0 || shape.color > 0xFFFFFF -> {
        print("invalid color")
        false
    }
    else -> true
}



var rectangle: RectangularShape = RectangularShape(-1, 2, 50, 100, 0xFF0000)
println("Is $rectangle valid? ${validateShape(rectangle)}")
rectangle = RectangularShape(2, 2, 1030, 100, 0xFF0000)
println("Is $rectangle valid? ${validateShape(rectangle)}")
rectangle = RectangularShape(2, 2, 50, 100, 0xFFFFFFF)
println("Is $rectangle valid? ${validateShape(rectangle)}")
rectangle = RectangularShape(2, 2, 50, 100, 0xFFFFFF)
println("Is $rectangle valid? ${validateShape(rectangle)}")

fun initShape(shape: RectangularShape?){
    if(shape == null)
        throw IllegalArgumentException()
    shape.apply {
        x = 10
        y = 10
        width = 100
        height = 200
        color = 0xFF0066
    }
}

initShape(null)
val secondRectangle: RectangularShape = RectangularShape(14, 15, 200, 20, 0x00FF00)
initShape(secondRectangle)
println("Init rectangle = $secondRectangle")

fun drawShape(shape: RectangularShape?){
    shape?.let {
        validateShape(it)
        it.measure()
        it.render()
    }
}

fun isPrime(n: Int): Boolean{
    if(n % 2 == 0)
        return false
    for(testNum in 3..sqrt(n.toDouble()).toInt() step 2){
        if(n % testNum == 0)
            return false
    }
    return true
}*/

import kotlin.math.sqrt

fun Int.isPrime() = this > 1 && (2..this / 2).none { this % it == 0 }

val data = listOf(4, 6, 34, 9, 2, 4, 7)
println("A result: $data")
println("B result: ${data.reversed()}")
println("C result: ${data.toSet().toList()}")
println("D result: ${data.subList(0, 3)}")
println("E result: ${data.all { it >= 0 }}")
println("F result: ${data.map { sqrt(it.toDouble()) }}")
println("G result: ${data.filter { it % 2 ==0 }}")
println("H result: ${data.mapIndexedNotNull { index, value -> if (value % 2 == 1) index else null }}")
println("I result: ${data.filter { it.isPrime() }}")
println("J result: ${data.last { it.isPrime() }}")

data class Student(val name: String, val address: String, val grade: Int)
val students = listOf(
    Student("John", "Boston", 6), Student("Jacob", "Baltimore", 2),
    Student("Edward", "New York", 7), Student("William", "Providence", 6),
    Student("Alice", "Philadelphia", 4), Student("Robert", "Boston", 7),
    Student("Richard", "Boston", 10), Student("Steven", "New York", 3)
)

println("A result: $students")
println("B result: ${students.sortedBy { it.name }}")
println("C result: ${students.map { it.name }.sorted()}")
println("D result: ${students.sortedWith(compareBy({it.grade}, {it.name}))}")
println("E result: ${students.groupBy { it.address }}")