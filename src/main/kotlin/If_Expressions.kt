fun main() {

    val openHours = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == openHours){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)



//    val openHours = 7
//    val now = 20
//    val ofFice: String
//
//    ofFice = if (now > openHours) {
//         "Office is a amazing"
//    } else {
//         "office is a beautiful"
//    }
//
//    print(ofFice)
}
