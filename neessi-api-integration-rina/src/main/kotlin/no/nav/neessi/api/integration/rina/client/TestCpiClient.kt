package no.nav.neessi.api.integration.rina.client

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.toEntity

@Component
class TestCpiClient(
    val cpiRestClient: RestClient,
    val properties: RinaCpiServiceProperties,
) {

    val log = logger {}

    /*
        klassen bare laget for test av cpi API'et, vil fjernet senere.
     */

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
        log.info { "Sending test: ${properties.rinaBaseUrl}/$uri" }
        return cpiRestClient
            .get()
            .uri(uri)
            .accept(APPLICATION_JSON)
            .retrieve()
            .toEntity<String>()
            .body!!
    }

    fun putTest(payload: TestPayload): String {
        val uri = payload.path
        log.info { "Sending test: ${properties.rinaBaseUrl}/$uri" }
        return cpiRestClient
            .put()
            .uri(uri)
            .body(payload.payload)
            .retrieve()
            .toEntity<String>()
            .body!!
    }

}

data class TestPayload(
    val payload: String,
    val path: String,
)
