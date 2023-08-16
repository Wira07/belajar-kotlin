//fun main() {
//    val today = Day.WEDNESDAY
//    println("Today is $today")  // Output: Today is WEDNESDAY
//
//    val dayNumber = when (today) {
//        Day.SUNDAY -> 1
//        Day.MONDAY -> 2
//        Day.TUESDAY -> 3
//        Day.WEDNESDAY -> 4
//        Day.THURSDAY -> 5
//        Day.FRIDAY -> 6
//        Day.SATURDAY -> 7
//    }
//    println("Day number: $dayNumber")  // Output: Day number: 4
//}
enum class Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}

fun main() {
    val today = Day.WEDNESDAY
    println("Today is $today")  // Output: Today is WEDNESDAY

    val dayNumber = when (today) {
        Day.SUNDAY -> 1
        Day.MONDAY -> 2
        Day.TUESDAY -> 3
        Day.WEDNESDAY -> 4
        Day.THURSDAY -> 5
        Day.FRIDAY -> 6
        Day.SATURDAY -> 7
    }
    println("Day number: $dayNumber")  // Output: Day number: 4
}
