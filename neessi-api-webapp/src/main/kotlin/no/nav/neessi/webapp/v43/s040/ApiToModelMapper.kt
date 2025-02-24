package no.nav.neessi.webapp.v43.s040

import no.nav.model.common.toEnum
import no.nav.model.v43.address.Address
import no.nav.model.v43.document.s040.S040
import no.nav.model.v43.document.s040.S040Request
import no.nav.model.v43.document.s040.S040Request.*
import no.nav.model.v43.person.*
import no.nav.model.v43.sector.Sector
import no.nav.neessi.openapi.model.v43.*

fun AddressType.toAddress() = Address(
    town = town,
    countryCode = countryCode,
    street = street,
    buildingName = buildingName,
    postalCode = postalCode,
    region = region,
    addressType = addressType?.name?.toEnum<Address.AddressEnumType>()
)

fun BirthPlaceType.toBirthPlace() = BirthPlace(
    town = town,
    region = region,
    countryCode = countryCode
)

fun ParentType.toParent() = Parent(
    forename = forename,
    familyNameAtBirth = familyNameAtBirth
)

fun PinType.toPin() = Pin(
    pin = pin,
    countryCode = countryCode,
    sector = sector?.name?.toEnum<Sector>(),
    institutionId = institutionId
)

fun PersonWithAddressType.toPerson() = Person(
    familyName = familyName,
    forename = forename,
    dateBirth = dateBirth,
    sex = sex.name.toEnum<Sex>(),
    familyNameAtBirth = familyNameAtBirth,
    forenameAtBirth = forenameAtBirth,
    pin = pin?.map { it.toPin() },
    nationality = nationality,
    birthPlace = birthPlace?.toBirthPlace(),
    father = father?.toParent(),
    mother = mother?.toParent(),
    address = address.toAddress()
)

fun S040RequestType.toS040Request() = S040Request(
    actingCompetentInstitutionWhoseLegislation = actingCompetentInstitutionWhoseLegislation,
    typeOfBenefitConcerned = typeOfBenefitConcernedEnumType?.name?.toEnum<TypeOfBenefitConcerned>(),
    natureOfBenefitConcerned = natureOfBenefitConcernedEnumType?.name?.toEnum<NatureOfBenefitConcerned>(),
    fixedPeriodConcernedStartDate = fixedPeriodConcernedStartDate,
    fixedPeriodConcernedEndDate = fixedPeriodConcernedEndDate,
    openPeriodConcerned = openPeriodConcernedEnumType?.name?.toEnum<OpenPeriodConcerned>(),
    openPeriodConcernedStartDate = openPeriodConcernedStartDate
)

fun S040Type.toS040() = S040(
    person = person.toPerson(),
    residenceInCountrySince = residenceInCountrySince!!,
    request = request!!.toS040Request(),
    additionalInformation = additionalInformation!!
)
