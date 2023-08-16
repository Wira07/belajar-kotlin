fun lucky(firstname: String, lastname: String?) {
    if (lastname == null) {
        println("Hello $firstname")
    } else {
        println("Hello $firstname $lastname")
    }
}