package day1.lecture1.exercises

/**
 * Create a nullable integer variable
 *
 * Use a null-check that increases the value by one if it's not null,
 * otherwise returns 0, and prints the result.
 *
 */
fun main() {
    var nullableInt: Int? = null  // null or 5

    if (nullableInt != null) {
        nullableInt++
    }
    else {
        nullableInt = 0
    }
    println(nullableInt)

}