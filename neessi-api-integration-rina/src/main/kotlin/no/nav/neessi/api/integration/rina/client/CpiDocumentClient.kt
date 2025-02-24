package no.nav.neessi.api.integration.rina.client

import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import no.nav.neessi.api.integration.rina.model.v43.documents.s040.S040CpiRoot
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.toEntity

@Component
class CpiDocumentClient(
    val cpiRestClient: RestClient,
    val properties: RinaCpiServiceProperties,
) {

    fun getDocument(caseId: Long, setId: String): S040CpiRoot {
        return cpiRestClient
            .get()
            .uri("/Cases/$caseId/Documents/$setId")
            .accept(APPLICATION_JSON)
            .retrieve()
            .toEntity<S040CpiRoot>()
            .body!!
    }
}
