package ImplementationsChallenges

class AppleAndOrange(startRangePoint: Int, endRangePoint: Int) {
    private val startRangePoint = startRangePoint
    private val endRangePoint = endRangePoint

    fun countInRange(point: Int, distances: List<Int>): Int {
        var count = 0
        for (i in distances) {
            val fallDistance = point + i
            if ((fallDistance >= startRangePoint) && (fallDistance <= endRangePoint)) {
                count++
            }
        }
        return count
    }
}

fun main(args: Array<String>) {
    val (homeStartPoint, homeEndPoint) = readLine()!!.split(" ").map(String::toInt)
    val (applePoint, orangePoint) = readLine()!!.split(" ").map(String::toInt)
    val (m, n) = readLine()!!.split(" ").map(String::toInt)
    val appleDistances = readLine()!!.split(" ").map(String::toInt)
    val orangeDistances = readLine()!!.split(" ").map(String::toInt)

    val appleOrange = AppleAndOrange(homeStartPoint, homeEndPoint)
    val appleInHouse = appleOrange.countInRange(applePoint, appleDistances)
    val orangeInHouse = appleOrange.countInRange(orangePoint, orangeDistances)

    println(appleInHouse)
    println(orangeInHouse)
}