package no.nav.neessi.api.integration.rina.common

import no.nav.model.common.EessiValue
import no.nav.neessi.api.integration.rina.model.v43.country.iso3ToEessiIso2

data class EessiValueWrapper(
    val value: List<String>
)

private fun String.valueWrapper() =
    EessiValueWrapper(listOf(this))

val EessiValue?.valueWrapper
    get() = this?.eessiValue?.valueWrapper()

val String.rinaCountryCodeValueWrapper: EessiValueWrapper
    get() = iso3ToEessiIso2(this).valueWrapper()

val List<String>?.rinaCountryCodeValueWrapper: EessiValueWrapper
    get() =
        if (this == null)
            EessiValueWrapper(emptyList())
        else
            EessiValueWrapper(this.map { iso3ToEessiIso2(it) })

inline fun <reified T> EessiValueWrapper.singleEnumFromEessiValue(): T where T : Enum<T>, T : EessiValue =
    enumValues<T>().firstOrNull { it.eessiValue == this.value.single() }
        ?: throw IllegalArgumentException("No eessi enum mappings for $this")
