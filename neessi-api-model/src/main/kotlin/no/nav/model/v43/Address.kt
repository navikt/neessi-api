package no.nav.model.v43

import no.nav.model.common.EessiValue

data class Address(
    val town: String,
    val countryCode: String,
    val street: String? = null,
    val buildingName: String? = null,
    val postalCode: String? = null,
    val region: String? = null,
    val addressType: AddressEnumType? = null
) {
    enum class AddressEnumType(override val eessiValue: String) : EessiValue {
        RESIDENCE("01"),
        STAY("02"),
        CONTACT("03"),
    }
}
