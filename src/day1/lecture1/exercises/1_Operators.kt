package day1.lecture1.exercises

/**
 *
 * 1. Print the sum of two Integers of your choice.
 *
 * 2. Print the subtraction of two numbers without using '-'.
 *
 * 3. Print the division of two numbers without using '/' and the result should be Double
 *
 */

fun main() {
    var num1 = 5
    var num2 = 3

    var sum = num1 + num2

    println(sum)

    var diff = num1.minus(num2)
    println(diff)

    var num3: Double = 5.0
    var divRes = num3.div(num2)
    println(divRes)
}