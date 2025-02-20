package no.nav.neessi.api.integration.rina.client

import io.github.oshai.kotlinlogging.KotlinLogging.logger

import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import org.springframework.http.MediaType.APPLICATION_JSON
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Component
import org.springframework.web.client.RestClient
import org.springframework.web.client.toEntity
import java.util.*

@Component
class RinaActionsClient(
    val cpiRestClient: RestClient,
    val properties: RinaCpiServiceProperties,
) {
    val log = logger {}

    fun documentAction(rinasakId: Long, action: UUID, body: Any) {
        val entity: ResponseEntity<String> = cpiRestClient
            .put()
            .uri("Cases/$rinasakId/Actions/$action/Document")
            .accept(APPLICATION_JSON)
            .contentType(APPLICATION_JSON)
            .body(body)
            .retrieve()
            .toEntity()
        log.info { "Action completed: ${entity.body}" }
    }

    private inline fun <reified T : Any> initialDocumentAction(rinasakId: Long, action: String): T {
        val entity: ResponseEntity<T> = cpiRestClient
            .get()
            .uri("Cases/$rinasakId/Actions/$action/InitialDocument")
            .accept(APPLICATION_JSON)
            .header("Nav-Call-Id", rinasakId.toString())
            .retrieve()
            .toEntity()
         return entity.body!!
    }

}
