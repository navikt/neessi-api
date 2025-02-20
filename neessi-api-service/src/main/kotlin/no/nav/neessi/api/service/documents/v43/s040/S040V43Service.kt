package no.nav.neessi.api.service.documents.v43.s040

import no.nav.model.v43.S040
import no.nav.neessi.api.integration.rina.service.RinaV43IntegrationService
import org.springframework.stereotype.Service
import java.util.*

@Service
class S040V43Service(
    val rinaV43IntegrationService: RinaV43IntegrationService
) {
    fun put(internationalId: String, documentId: UUID, sedType: String, document: S040) {
        rinaV43IntegrationService.put(internationalId, documentId, sedType, document)
    }
}
