package no.nav.model.v43.person

import no.nav.model.v43.sector.Sector

data class Pin(
    val pin: String,
    val countryCode: String,
    val sector: Sector?,
    val institutionId: String?
)
