package no.nav.neessi.webapp.v43.s040

import no.nav.model.common.toEnum
import no.nav.model.v43.address.Address
import no.nav.model.v43.document.s040.S040
import no.nav.model.v43.document.s040.S040Request
import no.nav.model.v43.person.BirthPlace
import no.nav.model.v43.person.Parent
import no.nav.model.v43.person.Person
import no.nav.model.v43.person.Pin
import no.nav.neessi.openapi.model.v43.*
import no.nav.neessi.openapi.model.v43.S040RequestType.*

/*
    Hvordan liker vi visuelt at mappers skal se ut? fun vs val f. eks.
 */

fun Address.toAddressType() = AddressType(
    town = town,
    countryCode = countryCode,
    street = street,
    buildingName = buildingName,
    postalCode = postalCode,
    region = region,
    addressType = addressType?.name?.toEnum<AddressEnumType>()
)

fun BirthPlace.toBirthPlaceType() = BirthPlaceType(
    town = town,
    region = region,
    countryCode = countryCode
)

fun Parent.toParentType() = ParentType(
    forename = forename,
    familyNameAtBirth = familyNameAtBirth
)

fun Pin.toPinType() = PinType(
    pin = pin,
    countryCode = countryCode,
    sector = sector?.name?.toEnum<SectorEnumType>(),
    institutionId = institutionId
)

fun Person.toPersonWithAddressType() = PersonWithAddressType(
    familyName = familyName,
    forename = forename,
    dateBirth = dateBirth,
    sex = sex.name.toEnum<SexEnumType>(),
    address = address?.toAddressType(),
    familyNameAtBirth = familyNameAtBirth,
    forenameAtBirth = forenameAtBirth,
    pin = pin?.map { it.toPinType() },
    nationality = nationality,
    birthPlace = birthPlace?.toBirthPlaceType(),
    father = father?.toParentType(),
    mother = mother?.toParentType()
)

fun S040Request.toS040RequestType() = S040RequestType(
    actingCompetentInstitutionWhoseLegislation = actingCompetentInstitutionWhoseLegislation,
    typeOfBenefitConcernedEnumType = typeOfBenefitConcerned?.name?.toEnum<TypeOfBenefitConcernedEnumType>(),
    natureOfBenefitConcernedEnumType = natureOfBenefitConcerned?.name?.toEnum<NatureOfBenefitConcernedEnumType>(),
    fixedPeriodConcernedStartDate = fixedPeriodConcernedStartDate,
    fixedPeriodConcernedEndDate = fixedPeriodConcernedEndDate,
    openPeriodConcernedEnumType = openPeriodConcerned?.name?.toEnum<OpenPeriodConcernedEnumType>(),
    openPeriodConcernedStartDate = openPeriodConcernedStartDate
)

fun S040.toS040Type() = S040Type(
    person = person.toPersonWithAddressType(),
    residenceInCountrySince = residenceInCountrySince,
    request = request.toS040RequestType(),
    additionalInformation = additionalInformation
)