package no.nav.model.v43.address

import no.nav.model.common.EessiValue

data class Address(
    val town: String,
    val countryCode: String,
    val street: String?,
    val buildingName: String?,
    val postalCode: String?,
    val region: String?,
    val addressType: AddressEnumType?
) {
    enum class AddressEnumType(override val eessiValue: String) : EessiValue {
        RESIDENCE("01"),
        STAY("02"),
        CONTACT("03"),
    }
}
