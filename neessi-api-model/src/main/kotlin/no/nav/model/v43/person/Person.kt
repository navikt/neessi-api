package no.nav.model.v43.person

import no.nav.model.v43.address.Address
import java.time.LocalDate

data class Person(
    val familyName: String,
    val forename: String,
    val dateBirth: LocalDate,
    val sex: Sex,
    val familyNameAtBirth: String?,
    val forenameAtBirth: String?,
    val pin: List<Pin>?,
    val nationality: List<String>?,
    val birthPlace: BirthPlace?,
    val father: Parent?,
    val mother: Parent?,
    val address: Address?,
)
