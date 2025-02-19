package no.nav.neessi.api.integration.rina.v43.documents.s040

import no.nav.model.v43.*
import no.nav.neessi.api.integration.rina.common.EessiValueWrapper
import no.nav.neessi.api.integration.rina.common.eessiAdditionalInformation
import no.nav.neessi.api.integration.rina.common.valueWrapper

val S040.cpiModel: S040CpiRoot
    get() = S040CpiRoot(
        s040 = s040Cpi
    )

val S040.s040Cpi: S040Cpi
    get() = S040Cpi(
        person = cpiPerson,
        addressPerson = addressPerson,
        request = request.cpiRequest,
        additionalInformation = additionalInformation.eessiAdditionalInformation,
        sedGVer = "4",
        sedVer = "3",
        sedPackage = "Sector Components/Sickness/S040"
    )

val S040Request.cpiRequest: S040Cpi.Request
    get() = S040Cpi.Request(
        periodConcerned = periodConcerned,
        typeBenefitConcerned = typeOfBenefitConcerned.valueWrapper,
        natureBenefitConcerned = natureOfBenefitConcerned.valueWrapper,
    )

val S040Request.periodConcerned: S040Cpi.PeriodConcerned
    get() = S040Cpi.PeriodConcerned(
        fixedPeriod = fixedPeriod
    )

val S040Request.fixedPeriod: S040Cpi.FixedPeriod
    get() = S040Cpi.FixedPeriod(
        startDate = fixedPeriodConcernedStartDate,
        endDate = fixedPeriodConcernedEndDate
    )

val S040.cpiPerson: S040Cpi.Person
    get() = S040Cpi.Person(
        personIdentification = personIdentification,
        additionalInformationPerson = additionalInformationPerson
    )

val S040.personIdentification: S040Cpi.PersonIdentification
    get() = S040Cpi.PersonIdentification(
        familyName = person.familyName,
        forename = person.forename,
        dateBirth = person.dateBirth,
        sex = person.sex.valueWrapper,
        familyNameAtBirth = person.familyNameAtBirth,
        forenameAtBirth = person.forenameAtBirth,
        pinPersonInEachInstitution = person.pin?.pinPersonInEachInstitution,
        ifPinNotProvidedForEveryInstitutionPleaseProvide = ifPINNotProvidedForEveryInstitutionPleaseProvide
    )

val Pin.pinPersonInEachInstitution: S040Cpi.PINPersonInEachInstitution
    get() = S040Cpi.PINPersonInEachInstitution(
        //TODO skal være liste
        personalIdentificationNumber = listOf(this.personalIdentificationNumber)
    )

val Pin.personalIdentificationNumber: S040Cpi.PersonalIdentificationNumber
    get() = S040Cpi.PersonalIdentificationNumber(
        country = this.countryCode.valueWrapper(),
        personalIdentificationNumber = this.pin,
        sector = this.sector.valueWrapper,
        institution = this.institution
    )

val Pin.institution: S040Cpi.Institution?
    get() = S040Cpi.Institution(
        institutionID = this.institutionId,
        //TODO må mappes
        institutionName = null
    )

val S040.ifPINNotProvidedForEveryInstitutionPleaseProvide
    get() = S040Cpi.IfPINNotProvidedForEveryInstitutionPleaseProvide(
        placeBirth = this.person.birthPlace?.placeBirth,
        fatherFamilyNameAtBirth = this.person.father?.familyNameAtBirth,
        forenameFather = this.person.father?.forename,
        motherFamilyNameAtBirth = this.person.mother?.familyNameAtBirth,
        forenameMother = this.person.mother?.forename,
    )

val BirthPlace.placeBirth: S040Cpi.PlaceBirth
    get() = S040Cpi.PlaceBirth(
        town = town,
        region = region,
        country = countryCode?.valueWrapper()
    )

val S040.additionalInformationPerson: S040Cpi.AdditionalInformationPerson?
    get() = S040Cpi.AdditionalInformationPerson(
        //TODO må mappes
        nationality = EessiValueWrapper(listOf("NO"))
    )

val S040.addressPerson: S040Cpi.AddressPerson
    get() = S040Cpi.AddressPerson(
        residenceInThisCountrySince = residenceInCountrySince,
        address = this.person.address?.cpiAddress,
    )

val Address.cpiAddress: S040Cpi.Address
    get() = S040Cpi.Address(
        street = street,
        buildingName = buildingName,
        town = town,
        postalCode = postalCode,
        region = region,
        country = countryCode,
    )