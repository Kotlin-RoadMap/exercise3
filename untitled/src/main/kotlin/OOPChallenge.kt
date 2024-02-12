
fun main() {

    val bicycle = KotlinBicycle(11, 12, 13)
    bicycle.printDescription()
    println()

    val mountainBike = KotlinMountainBike(123, 4, 5, 6)
    mountainBike.printDescription()
    println()

    val roadBike = KotlinRoadBike(7, 8, 9, 45)
    roadBike.printDescription()
    println()

    val bicycle2 = KotlinBicycle(14, 7)
    bicycle2.printDescription()
    println()

    val mountainBike2 = KotlinMountainBike(111, 5, 9)
    mountainBike2.printDescription()
    println()

    val roadBike2 = KotlinRoadBike(12, 4, 11)
    roadBike2.printDescription()
    println()

    val thirdMountainBike = KotlinMountainBike("Blue", 10, 10, 10)
    thirdMountainBike.printDescription()
    println()

    KotlinMountainBike.availableColors.forEach({ println(it) })
}


open class KotlinBicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun applyBrake(decrement: Int) {
        speed -= decrement;
    }

    fun speedUp(increment: Int) {
        speed += increment;
    }

    open fun printDescription() =
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
}

open class KotlinMountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) : KotlinBicycle(cadence, speed, gear) {


    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    private var color: String = ""

    constructor(colorParameter: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
            this(seatHeight, cadence, speed, gear) {
        color = colorParameter
        println("color: $color")
    }




    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}



open class KotlinRoadBike(val tireWidth: Int, cadence: Int, speed: Int, gear: Int = 10) : KotlinBicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}

