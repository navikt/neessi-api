package no.nav.model.v43

import no.nav.model.common.EessiValue

enum class Sector(override val eessiValue: String) : EessiValue {
    SICKNESS("01"),
    PENSIONS("01")
}
