package ImplementationsChallenges

class BetweenTwoSets() {

    fun find(listA: List<Int>, listB: List<Int>): Int {
        val startLoop = listA.last()
        val endLoop = listB.first()

        if (endLoop - startLoop < 1) {
            return 0
        }

        val factorA = arrayListOf<Int>()
        loopA@ for (i in startLoop..endLoop) {
            for (x in listA) {
                val mod = i % x
                if (mod > 0) {
                    continue@loopA
                }
            }
            factorA.add(i)
        }

        val factorB = arrayListOf<Int>()
        loopB@ for (factorA in factorA) {
            for (y in listB) {
                val modB = y % factorA
                if (modB > 0) {
                    continue@loopB
                }
            }
            factorB.add(factorA)
        }

        return factorB.size
    }
}

fun main(args: Array<String>) {
    val (numListA, numListB) = readLine()!!.split(" ").map(String::toInt)
    val listA = readLine()!!.split(" ").map(String::toInt)
    val listB = readLine()!!.split(" ").map(String::toInt)
    val betweenToSets = BetweenTwoSets()
    println(betweenToSets.find(listA, listB))
}