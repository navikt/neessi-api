package no.nav.neessi.api.integration.rina.v43.documents.s040

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import no.nav.neessi.api.integration.rina.common.AdditionalInformation
import no.nav.neessi.api.integration.rina.common.EessiValueWrapper
import java.time.LocalDate

data class S040CpiRoot(
    @JsonProperty("S040")
    val s040: S040Cpi
)

data class S040Cpi(
    @JsonProperty("Person")
    val person: Person?,
    @JsonProperty("AddressPerson")
    val addressPerson: AddressPerson?,
    @JsonProperty("Request")
    val request: Request?,
    @JsonProperty("AdditionalInformation")
    val additionalInformation: AdditionalInformation?,
    val sedGVer: String?,
    val sedVer: String?,
    val sedPackage: String
) {

    data class Person(
        @JsonProperty("PersonIdentification")
        val personIdentification: PersonIdentification?,
        @JsonProperty("AdditionalInformationPerson")
        val additionalInformationPerson: AdditionalInformationPerson?
    )

    data class PersonIdentification(
        val familyName: String?,
        val forename: String?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        val dateBirth: LocalDate?,
        val sex: EessiValueWrapper?,
        val familyNameAtBirth: String?,
        val forenameAtBirth: String?,
        @JsonProperty("PINPersonInEachInstitution")
        val pinPersonInEachInstitution: PINPersonInEachInstitution?,
        @JsonProperty("IfPINNotProvidedForEveryInstitutionPleaseProvide")
        val ifPinNotProvidedForEveryInstitutionPleaseProvide: IfPINNotProvidedForEveryInstitutionPleaseProvide?
    )

    data class PINPersonInEachInstitution(
        @JsonProperty("PersonalIdentificationNumber")
        val personalIdentificationNumber: List<PersonalIdentificationNumber>?
    )

    data class PersonalIdentificationNumber(
        val country: EessiValueWrapper?,
        val personalIdentificationNumber: String?,
        val sector: EessiValueWrapper?,
        @JsonProperty("Institution")
        val institution: Institution?
    )

    data class Institution(
        val institutionID: String?,
        val institutionName: String?
    )

    data class IfPINNotProvidedForEveryInstitutionPleaseProvide(
        @JsonProperty("PlaceBirth")
        val placeBirth: PlaceBirth?,
        val fatherFamilyNameAtBirth: String?,
        val forenameFather: String?,
        val motherFamilyNameAtBirth: String?,
        val forenameMother: String?
    )

    data class PlaceBirth(
        val town: String?,
        val region: String?,
        val country: EessiValueWrapper?
    )

    data class AdditionalInformationPerson(
        val nationality: EessiValueWrapper?
    )

    data class AddressPerson(
        @JsonProperty("Address")
        val address: Address?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        val residenceInThisCountrySince: LocalDate?
    )

    data class Address(
        val street: String?,
        val buildingName: String?,
        val town: String?,
        val postalCode: String?,
        val region: String?,
        val country: String?
    )

    data class Request(
        val typeBenefitConcerned: EessiValueWrapper?,
        val natureBenefitConcerned: EessiValueWrapper?,
        @JsonProperty("PeriodConcerned")
        val periodConcerned: PeriodConcerned?
    )

    data class PeriodConcerned(
        @JsonProperty("FixedPeriod")
        val fixedPeriod: FixedPeriod?
    )

    data class FixedPeriod(
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        val startDate: LocalDate?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        val endDate: LocalDate?
    )

}
