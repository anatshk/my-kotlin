package day1.lecture3.exercises


import java.util.*

/**
 * __________________________________________________________
 * FIY:
 * Random().nextInt(num)
 * this is how to get random numbers in Kotlin from 0 to num
 * __________________________________________________________
 *
 * Create a lambda and assign it to rollDice, which returns a dice roll (number between 1 and 12).
 *
 * Extend the lambda to take an argument indicating the number of sides of the dice used for the roll.
 *
 * If you haven't done so, fix the lambda to return 0 if the number of sides passed in is 0.
 *
 * Create a new variable, rollDice2, for this same lambda using the function type notation. (type notation for example: (String)->Int)
 *
 */

fun main() {
    //write your code here
    var rollDice = {Random().nextInt(12) + 1}
    var rollDiceSides: (Int) -> Int = {sides -> if (sides == 0) 0 else Random().nextInt(sides) + 1}

    println("rollDice:")
    println(rollDice())
    println(rollDice())
    println(rollDice())
    println(rollDice())
    println(rollDice())

    println("rollDice with 4 sides")
    println(rollDiceSides(4))
    println(rollDiceSides(4))
    println(rollDiceSides(4))
    println(rollDiceSides(4))

    println("rolldice 0")
    println(rollDiceSides(0))
}