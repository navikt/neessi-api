package no.nav.neessi.api.integration.rina.service

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.model.v43.S040
import org.springframework.stereotype.Service
import java.util.*

@Service
class RinaV43IntegrationService(
    val rinaIntegrationService: RinaIntegrationService
) {

    val log = logger {}

    fun put(internationalId: String, documentId: UUID, sedType: String, document: S040) {
        log.info { "Creating S040" }
        rinaIntegrationService.put(internationalId, documentId, sedType, document)
        log.info { "S040 is created" }
    }

}
