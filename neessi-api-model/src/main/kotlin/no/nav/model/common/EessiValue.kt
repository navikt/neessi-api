package no.nav.model.common

interface EessiValue {
    val eessiValue: String
}

inline fun <reified T> String.enumFromEessiValue(): T where T : Enum<T>, T : EessiValue =
    enumValues<T>().firstOrNull { it.eessiValue == this }
        ?: throw IllegalArgumentException("No eessi enum mappings for $this")
