package no.nav.neessi.api.integration.rina.common

data class AdditionalInformation(
    val additionalInformation: String
)

val String.eessiAdditionalInformation: AdditionalInformation
    get() = AdditionalInformation(this)
