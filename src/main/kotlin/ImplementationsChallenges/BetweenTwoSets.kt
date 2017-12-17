package ImplementationsChallenges

class BetweenTwoSets() {
    fun find(listA: List<Int>, listB: List<Int>): Int {
        val startLoop = listA.max()!!
        val endLoop = listB.min()!!

        val results = (startLoop..endLoop).filter({ x ->
            listA.all { x % it == 0 } && listB.all { it % x == 0 }
        })

        return results.count()
    }
}

fun main(args: Array<String>) {
    readLine()!!.split(" ").map(String::toInt)
    val listA = readLine()!!.split(" ").map(String::toInt)
    val listB = readLine()!!.split(" ").map(String::toInt)
    val betweenToSets = BetweenTwoSets()
    println(betweenToSets.find(listA, listB))
}