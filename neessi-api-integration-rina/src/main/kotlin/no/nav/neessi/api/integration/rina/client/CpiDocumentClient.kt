package no.nav.neessi.api.integration.rina.client

import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import org.springframework.core.ParameterizedTypeReference
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient

@Component
class CpiDocumentClient(
    val cpiRestClient: RestClient,
    val properties: RinaCpiServiceProperties,
) {

    fun <T> getDocument(caseId: Long, setId: String, typeRef: ParameterizedTypeReference<T>): T {
        return cpiRestClient
            .get()
            .uri("/eessiRest/Cases/$caseId/Documents/$setId")
            .accept(APPLICATION_JSON)
            .retrieve()
            .toEntity(typeRef)
            .body!!
    }
}
