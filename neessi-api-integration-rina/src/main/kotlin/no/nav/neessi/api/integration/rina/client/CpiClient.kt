package no.nav.neessi.api.integration.rina.client

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.model.v43.S040
import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import no.nav.neessi.api.integration.rina.v43.documents.s040.cpiRootModel
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.toEntity

@Component
class CpiClient(
    val cpiRestClient: RestClient,
    val properties: RinaCpiServiceProperties,
) {

    val log = logger {}

    fun postTest(payload: TestPayload): String {
        val uri = payload.path
        log.info { "Sending test: ${properties.rinaBaseUrl}/$uri" }
        return cpiRestClient
            .post()
            .uri("/eessiRest/$uri")
            .body(payload.payload)
            .retrieve()
            .toEntity<String>()
            .body!!
    }

    fun getTest(payload: TestPayload): String {
        val uri = payload.path
        log.info { "Sending test: ${properties.rinaBaseUrl}/eessiRest/$uri" }
        return cpiRestClient
            .get()
            .uri("/eessiRest/$uri")
            .retrieve()
            .toEntity<String>()
            .body!!
    }

    fun putTest(payload: TestPayload): String {
        val uri = payload.path
        log.info { "Sending test: ${properties.rinaBaseUrl}/$uri" }
        return cpiRestClient
            .put()
            .uri("/eessiRest/$uri")
            .body(payload.payload)
            .retrieve()
            .toEntity<String>()
            .body!!
    }

    fun put(sO40: S040) {
        put(sO40.cpiRootModel)
    }

    private fun put(any: Any) =
        cpiRestClient
            .put()
            .uri("/eessiRest/Cases/")
            .body(any)
            .retrieve()

}

data class TestPayload(
    val payload: String,
    val path: String,
)
