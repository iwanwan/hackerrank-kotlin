package ImplementationsChallenges

class Kangaroo() {
    fun canMeet(first: List<Int>, second: List<Int>): String {
        val firstPoint = first[0]
        val firstSpeed = first[1]
        val secondPoint = second[0]
        val secondSpeed = second[1]

        if (firstPoint < secondPoint && firstSpeed > secondSpeed) {
            var v1 = (firstPoint + firstSpeed)
            var v2 = (secondPoint + secondSpeed)
            for (i in 0..10000) {
                if (v1 == v2) {
                    return "YES"
                }

                v1 = v1 + firstSpeed
                v2 = v2 + secondSpeed
            }
        }

        return "NO"
    }
}

fun main(args: Array<String>) {
    val (firstPoint, firstSpeed, secondPoint, secondSpeed) = readLine()!!.split(" ").map(String::toInt)
    val firstKangaroo = listOf(firstPoint, firstSpeed)
    val secondKangaroo = listOf(secondPoint, secondSpeed)
    val kangaroo = Kangaroo()

    println(kangaroo.canMeet(firstKangaroo, secondKangaroo))
}
