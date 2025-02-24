package no.nav.model.v43.document.s040

import no.nav.model.v43.person.Person
import java.time.LocalDate

data class S040(
    val person: Person,
    val residenceInCountrySince: LocalDate,
    val request: S040Request,
    val additionalInformation: String,
)
