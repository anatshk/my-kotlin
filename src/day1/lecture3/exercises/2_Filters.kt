package day1.lecture3.exercises

/**
 * Create a filter that gets all the curries and sorts them by string length.
 *
 * Filter the list of spices to return all the spices that start with 'c' and end in 'e'.
 *
 * **Bonus**
 * Take the first three elements of the list and return the ones that start with 'c'.
 */

fun main() {

    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    //create the filters here

    // curry by length
    var lenFilter = spices.asSequence().filter{it.contains("curry")}.sortedBy { it.length }
    println(lenFilter.toList())

    // starts with 'c', ends with 'e'
    var ceFilter = spices.asSequence().filter{it.startsWith('c').and(it.endsWith('e'))}
    println(ceFilter.toList())

    // first three elements, start with c
    var threeEFilter = spices.take(3).asSequence().filter{it.startsWith('c')}
    println(threeEFilter.toList())


}
