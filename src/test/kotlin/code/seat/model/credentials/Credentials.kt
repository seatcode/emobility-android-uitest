package code.seat.model.credentials

data class Credentials (
    val userEmail : String,
    val userPassword : String
)

fun validCredentials() : Credentials{
    return Credentials(
        userEmail = System.getProperty("EMOBILITY_USER_EMAIL"),
        userPassword = System.getProperty("EMOBILITY_USER_PASSWORD")
    )
}