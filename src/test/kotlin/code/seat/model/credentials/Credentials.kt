package code.seat.model.credentials

data class Credentials (
    val userEmail : String,
    val userPassword : String
)

fun validCredentials() : Credentials{
    return Credentials(
        userEmail = "gerard.torrent+1803@code.seat",
        userPassword = "Mang0filipni0"
    )
}
