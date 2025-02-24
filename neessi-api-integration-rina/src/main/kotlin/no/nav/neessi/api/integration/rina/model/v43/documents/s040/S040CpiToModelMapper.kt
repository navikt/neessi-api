package no.nav.neessi.api.integration.rina.model.v43.documents.s040

import no.nav.model.v43.document.s040.S040
import no.nav.model.v43.document.s040.S040Request
import no.nav.model.v43.person.Person
import no.nav.neessi.api.integration.rina.common.singleEnumFromEessiValue

val S040CpiRoot.s040Model: S040
    get() = S040(
        person = s040.toPerson(),
        request = s040.toRequest(),
        additionalInformation = s040.additionalInformation?.additionalInformation,
        residenceInCountrySince = s040.addressPerson?.residenceInThisCountrySince,
    )

fun S040Cpi.toRequest(): S040Request = 
    S040Request(null, null, null, null, null, null, null)

fun S040Cpi.toPerson(): Person =
    Person(
        familyName = person?.personIdentification?.familyName ?: "",
        forename = person?.personIdentification?.forename ?: "",
        dateBirth = person?.personIdentification?.dateBirth!!,
        sex = person?.personIdentification?.sex?.singleEnumFromEessiValue()!!,
        familyNameAtBirth = person?.personIdentification?.familyNameAtBirth,
        forenameAtBirth = person?.personIdentification?.forenameAtBirth,
        pin = null,
        nationality = null,
        birthPlace = null,
        father = null,
        mother = null,
        address = null,
    )

