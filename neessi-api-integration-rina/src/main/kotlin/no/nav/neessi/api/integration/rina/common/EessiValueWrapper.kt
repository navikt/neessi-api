package no.nav.neessi.api.integration.rina.common

import no.nav.model.common.EessiValue

data class EessiValueWrapper(
    val value: List<String>
)

fun String.valueWrapper() =
    EessiValueWrapper(listOf(this))

val EessiValue?.valueWrapper
    get() = this?.eessiValue?.valueWrapper()

val List<String>?.valueWrapper
    get() =
        if (this != null)
            EessiValueWrapper()