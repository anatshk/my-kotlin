package day1.lecture2.exercises

/**
 * Create two ranges
 *      numbers between 1 - 20
 *      letters between 'a' - 'q'
 *
 * Check if a number lies within a range.
 * Check if a letter lies within a range.
 *
 * Iterate over the ranges you created earlier and print the results
 *      extra: with jumps of 2
 *      extra: backwards
 */
fun main() {
    //Write your code below this line

    //Create the ranges below this line
    var rangeNum = 1..20
    var rangeLetter = 'a'..'q'

    //Use the ranges with an if statement below this line
    var num = 100
    if (num in rangeNum) {
            println("$num in range")
        } else {
        println("$num not in range")
    }

    var letter = 'b'
    if (letter in rangeLetter) {
        println("$letter in range")
    } else {
        println("$letter not in range")
    }

    //Iterate over the ranges below this line
    for (num1 in rangeNum step 2) {
        println(num1)
    }

    for (letter1 in rangeLetter.reversed()) {
        println(letter1)
    }
}