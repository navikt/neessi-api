package no.nav.model.v43

import no.nav.model.common.EessiValue
import java.time.LocalDate

data class S040Request(
    val actingCompetentInstitutionWhoseLegislation: String? = null,
    val typeOfBenefitConcerned: TypeOfBenefitConcerned? = null,
    val natureOfBenefitConcerned: NatureOfBenefitConcerned? = null,
    val fixedPeriodConcernedStartDate: LocalDate? = null,
    val fixedPeriodConcernedEndDate: LocalDate? = null,
    val openPeriodConcerned: OpenPeriodConcerned? = null,
    val openPeriodConcernedStartDate: LocalDate? = null
) {

    enum class TypeOfBenefitConcerned(override val eessiValue: String) : EessiValue {
        SICKNESS("01"),
        MATERNITY("01"),
        PATERNITY("01"),
    }

    enum class NatureOfBenefitConcerned(override val eessiValue: String) : EessiValue {
        IN_MINUS_CASH("01"),
        IN_MINUS_KIND("01"),
    }

    enum class OpenPeriodConcerned(override val eessiValue: String) : EessiValue {
        OPEN_MINUS_ENDED("01"),
        END_MINUS_DATE_MINUS_UNKNOWN("01"),
    }
}
