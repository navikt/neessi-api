package no.nav.neessi.api.integration.rina.client

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import no.nav.neessi.api.integration.rina.model.case.RinaCase
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.toEntity

@Component
class CpiCasesClient(
    val cpiRestClient: RestClient,
    val properties: RinaCpiServiceProperties,
) {

    val log = logger {}

    fun getCase(internationalId: String): RinaCase {
        return cpiRestClient
            .get()
            .uri("/Cases/ByInternationalId/$internationalId")
            .accept(APPLICATION_JSON)
            .retrieve()
            .toEntity<RinaCase>()
            .body!!
    }
}