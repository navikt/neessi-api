package no.nav.model.v43

import java.time.LocalDate

data class S040(
    val person: Person,
    val residenceInCountrySince: LocalDate,
    val request: S040Request,
    val additionalInformation: String,
)
