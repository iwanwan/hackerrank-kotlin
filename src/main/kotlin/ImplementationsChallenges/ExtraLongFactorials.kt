package ImplementationsChallenges

import java.math.BigInteger

fun Long.toBigInteger() = BigInteger.valueOf(this)
fun Int.toBigInteger() = BigInteger.valueOf(toLong())


fun main(args: Array<String>) {
    println("input number")
    val number = readLine()!!.toInt()
    var factorial = number.toBigInteger()
    for (i in (number - 1) downTo 1) {
        factorial = factorial * i.toBigInteger()
    }

    println(factorial)
}