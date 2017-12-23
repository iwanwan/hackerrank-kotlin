package ImplementationsChallenges

class BreakingTheRecords(records: List<Int>) {
    private val records = records

    fun highest(): List<Int>{
        val result = arrayListOf<Int>()
        var highest = records.first()
        records.forEach({
            val record = it
            if(highest < record){
                highest = record
                result.add(record)
            }
        })
        return result
    }

    fun lowest(): List<Int>{
        val result = arrayListOf<Int>()
        var lowest = records.first()
        records.forEach({
            val record = it
            if(lowest > record){
                lowest = record
                result.add(record)
            }
        })
        return result
    }
}

fun main(args: Array<String>) {
    readLine()
    val records = readLine()!!.split(" ").map(String::toInt)
    val breakingTheRecords = BreakingTheRecords(records)
    val highest = breakingTheRecords.highest()
    val lowest = breakingTheRecords.lowest()

    print("${highest.size} ${lowest.size}")
}