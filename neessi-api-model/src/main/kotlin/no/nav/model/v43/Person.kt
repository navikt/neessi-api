package no.nav.model.v43

import java.time.LocalDate

data class Person(
    val familyName: String,
    val forename: String,
    val dateBirth: LocalDate,
    val sex: Sex,
    val familyNameAtBirth: String? = null,
    val forenameAtBirth: String? = null,
    val pin: Pin? = null,
    val nationality: List<String>? = null,
    val birthPlace: BirthPlace? = null,
    val father: Parent? = null,
    val mother: Parent? = null,
    val address: Address?,
)
