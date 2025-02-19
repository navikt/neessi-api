package no.nav.model.v43

data class Pin(
    val pin: String,
    val countryCode: String,
    val sector: Sector? = null,
    val institutionId: String? = null
)
