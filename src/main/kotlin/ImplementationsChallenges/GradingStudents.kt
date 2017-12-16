package ImplementationsChallenges

import java.util.*

class GradingStudents() {
    fun count(grades: List<Int>): List<Int>{
        val results = arrayListOf<Int>()
        for(i in grades){
            var rounded = i
            val modOfFive =  i%5
            if((rounded >= 38) && (modOfFive >= 3))  {
                rounded = i + (5 - modOfFive)
            }
            results.add(rounded)
        }
        return results
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var numOfGrades = input.nextInt()
    if(numOfGrades < 61) {
        val grades = arrayListOf<Int>()
        while (numOfGrades > 0) {
            grades.add(input.nextInt())
            numOfGrades--
        }
        val gradingStudents = GradingStudents()
        for (i in gradingStudents.count(grades)) {
            println(i)
        }
    }
}