package no.nav.neessi.webapp.v43.mapper

import no.nav.model.v43.address.Address
import no.nav.model.v43.document.s040.S040
import no.nav.model.v43.document.s040.S040Request
import no.nav.model.v43.person.*
import no.nav.model.v43.sector.Sector
import no.nav.neessi.openapi.model.v43.*

fun Address.toAddressType() = AddressType(
    town = town,
    countryCode = countryCode,
    street = street,
    buildingName = buildingName,
    postalCode = postalCode,
    region = region,
    addressType = addressType?.toApi()
)

fun AddressType.toAddress() = Address(
    town = town,
    countryCode = countryCode,
    street = street,
    buildingName = buildingName,
    postalCode = postalCode,
    region = region,
    addressType = addressType?.toModel()
)

fun Address.AddressEnumType.toApi() = AddressEnumType.valueOf(name)
fun AddressEnumType.toModel() = Address.AddressEnumType.valueOf(name)

fun BirthPlace.toBirthPlaceType() = BirthPlaceType(
    town = town,
    region = region,
    countryCode = countryCode
)

fun BirthPlaceType.toBirthPlace() = BirthPlace(
    town = town,
    region = region,
    countryCode = countryCode
)

fun Parent.toParentType() = ParentType(
    forename = forename,
    familyNameAtBirth = familyNameAtBirth
)

fun ParentType.toParent() = Parent(
    forename = forename,
    familyNameAtBirth = familyNameAtBirth
)

fun Pin.toPinType() = PinType(
    pin = pin,
    countryCode = countryCode,
    sector = sector?.toApi(),
    institutionId = institutionId
)

fun PinType.toPin() = Pin(
    pin = pin,
    countryCode = countryCode,
    sector = sector?.toModel(),
    institutionId = institutionId
)

fun Sector.toApi() = SectorEnumType.valueOf(name)
fun SectorEnumType.toModel() = Sector.valueOf(name)

fun Sex.toApi() = SexEnumType.valueOf(name)
fun SexEnumType.toModel() = Sex.valueOf(name)

fun Person.toPersonType() = PersonType(
    familyName = familyName,
    forename = forename,
    dateBirth = dateBirth,
    sex = sex.toApi(),
    familyNameAtBirth = familyNameAtBirth,
    forenameAtBirth = forenameAtBirth,
    pin = pin?.map { it.toPinType() },
    nationality = nationality,
    birthPlace = birthPlace?.toBirthPlaceType(),
    father = father?.toParentType(),
    mother = mother?.toParentType()
)

fun PersonType.toPerson() = Person(
    familyName = familyName,
    forename = forename,
    dateBirth = dateBirth,
    sex = sex.toModel(),
    familyNameAtBirth = familyNameAtBirth,
    forenameAtBirth = forenameAtBirth,
    pin = pin?.map { it.toPin() },
    nationality = nationality,
    birthPlace = birthPlace?.toBirthPlace(),
    father = father?.toParent(),
    mother = mother?.toParent(),
    address = null
)

fun Person.toPersonWithAddressType(address: Address) = PersonWithAddressType(
    familyName = familyName,
    forename = forename,
    dateBirth = dateBirth,
    sex = sex.toApi(),
    address = address.toAddressType(),
    familyNameAtBirth = familyNameAtBirth,
    forenameAtBirth = forenameAtBirth,
    pin = pin?.map { it.toPinType() },
    nationality = nationality,
    birthPlace = birthPlace?.toBirthPlaceType(),
    father = father?.toParentType(),
    mother = mother?.toParentType()
)

fun PersonWithAddressType.toPerson() = Person(
    familyName = familyName,
    forename = forename,
    dateBirth = dateBirth,
    sex = sex.toModel(),
    familyNameAtBirth = familyNameAtBirth,
    forenameAtBirth = forenameAtBirth,
    pin = pin?.map { it.toPin() },
    nationality = nationality,
    birthPlace = birthPlace?.toBirthPlace(),
    father = father?.toParent(),
    mother = mother?.toParent(),
    address = address.toAddress()
)

fun S040Request.toS040RequestType() = S040RequestType(
    actingCompetentInstitutionWhoseLegislation = actingCompetentInstitutionWhoseLegislation,
    typeOfBenefitConcernedEnumType = typeOfBenefitConcerned?.toApi(),
    natureOfBenefitConcernedEnumType = natureOfBenefitConcerned?.toApi(),
    fixedPeriodConcernedStartDate = fixedPeriodConcernedStartDate,
    fixedPeriodConcernedEndDate = fixedPeriodConcernedEndDate,
    openPeriodConcernedEnumType = openPeriodConcerned?.toApi(),
    openPeriodConcernedStartDate = openPeriodConcernedStartDate
)

fun S040RequestType.toS040Request() = S040Request(
    actingCompetentInstitutionWhoseLegislation = actingCompetentInstitutionWhoseLegislation,
    typeOfBenefitConcerned = typeOfBenefitConcernedEnumType?.toModel(),
    natureOfBenefitConcerned = natureOfBenefitConcernedEnumType?.toModel(),
    fixedPeriodConcernedStartDate = fixedPeriodConcernedStartDate,
    fixedPeriodConcernedEndDate = fixedPeriodConcernedEndDate,
    openPeriodConcerned = openPeriodConcernedEnumType?.toModel(),
    openPeriodConcernedStartDate = openPeriodConcernedStartDate
)

fun S040Request.TypeOfBenefitConcerned.toApi() =
    S040RequestType.TypeOfBenefitConcernedEnumType.valueOf(name)
fun S040RequestType.TypeOfBenefitConcernedEnumType.toModel() =
    S040Request.TypeOfBenefitConcerned.valueOf(name)
fun S040Request.NatureOfBenefitConcerned.toApi() =
    S040RequestType.NatureOfBenefitConcernedEnumType.valueOf(name)
fun S040RequestType.NatureOfBenefitConcernedEnumType.toModel() =
    S040Request.NatureOfBenefitConcerned.valueOf(name)
fun S040Request.OpenPeriodConcerned.toApi() =
    S040RequestType.OpenPeriodConcernedEnumType.valueOf(name)
fun S040RequestType.OpenPeriodConcernedEnumType.toModel() =
    S040Request.OpenPeriodConcerned.valueOf(name)

fun S040.toS040Type(address: Address) = S040Type(
    person = person.toPersonWithAddressType(address),
    residenceInCountrySince = residenceInCountrySince,
    request = request.toS040RequestType(),
    additionalInformation = additionalInformation
)

fun S040Type.toS040() = S040(
    person = person.toPerson(),
    residenceInCountrySince = residenceInCountrySince!!,
    request = request!!.toS040Request(),
    additionalInformation = additionalInformation!!
)
