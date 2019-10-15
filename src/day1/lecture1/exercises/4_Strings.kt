package day1.lecture1.exercises

/**
 *
 * BMI calculator!
 *
 * Body mass index (BMI) is a value derived from the mass (weight) and height of a person.
 * The BMI is defined as the body mass divided by the square of the body height,
 * and is universally expressed in units of kg/(m^2),
 * resulting from mass in kilograms and height in metres.
 *
 * Calculate my cat's BMI.
 * He wieghts 5.2 kg, and about 48 cm long (which is 0.48 metter's)
 *
 * Create two variables for my cat's weight (mass) in kg, and length (m).
 *
 * Use a String template to print my cat's BMI. [mass / (length.pow(2))]
 *
 * BONUS: compare my cat to a 2 year old girl:
 * underwight - 	BMI equalse or below 15.5
 * normal weight - 	BMI between 15.5 to 17.5
 * overwight - 		BMI equalse or above 17.5
 * add to the string template weather my cat is underweight, normal weight or overweight.
 *
 */
import kotlin.math.pow

fun main() {
    var weight_kg = 5.2
    var length_m = 0.48

    val underweight = 15.5
    val overweight = 17.5

    var bmi = weight_kg.div(length_m.pow(2))
    var status: String? = null
    // This is not the optimal way to write the condition.
    // alt + enter - shows options to rewrite code
    if (bmi < underweight) {
        status = "underweight"
    }
    else {
        if (bmi < overweight) {
            status = "normal weight"
        }
        else {
            status = "overweight"
        }
    }

//    println("cat BMI: ${weight_kg.div(length_m.pow(2))}")
    println("cat BMI: $bmi, cat is $status")
}
