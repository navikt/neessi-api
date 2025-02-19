package no.nav.model.v43

import no.nav.model.common.EessiValue

enum class Sex(override val eessiValue: String) : EessiValue {
    MALE("01"),
    FEMALE("02"),
    UNKNOWN("99")
}
