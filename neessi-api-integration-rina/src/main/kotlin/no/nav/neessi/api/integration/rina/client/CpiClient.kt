package no.nav.neessi.api.integration.rina.client

import no.nav.model.v43.S040
import no.nav.neessi.api.integration.rina.v43.documents.s040.cpiRootModel
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient

@Component
class CpiClient(
    val cpiRestClient: RestClient
) {

    fun put(sO40: S040) {
        put(sO40.cpiRootModel)
    }

    private fun put(any: Any) =
        cpiRestClient
            .put()
            .uri("/cpi")
            .body(any)
            .retrieve()

}