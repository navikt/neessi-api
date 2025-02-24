package no.nav.model.v43.sector

import no.nav.model.common.EessiValue

enum class Sector(override val eessiValue: String) : EessiValue {
    AWOD("01"),
    FAMILY("02"),
    ALL("03"),
    PENSIONS("04"),
    RECOVERY("05"),
    SICKNESS("06"),
    UNEMPLOYMENT("07"),
}
