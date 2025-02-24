package no.nav.model.v43.document.s040

import no.nav.model.common.EessiValue
import java.time.LocalDate

data class S040Request(
    val actingCompetentInstitutionWhoseLegislation: String?,
    val typeOfBenefitConcerned: TypeOfBenefitConcerned?,
    val natureOfBenefitConcerned: NatureOfBenefitConcerned?,
    val fixedPeriodConcernedStartDate: LocalDate?,
    val fixedPeriodConcernedEndDate: LocalDate?,
    val openPeriodConcerned: OpenPeriodConcerned?,
    val openPeriodConcernedStartDate: LocalDate?
) {

    enum class TypeOfBenefitConcerned(override val eessiValue: String) : EessiValue {
        SICKNESS("01"),
        MATERNITY("02"),
        PATERNITY("03"),
    }

    enum class NatureOfBenefitConcerned(override val eessiValue: String) : EessiValue {
        IN_MINUS_CASH("01"),
        IN_MINUS_KIND("02"),
    }

    enum class OpenPeriodConcerned(override val eessiValue: String) : EessiValue {
        OPEN_MINUS_ENDED("01"),
        END_MINUS_DATE_MINUS_UNKNOWN("98"),
    }
}
