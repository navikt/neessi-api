package no.nav.neessi.api.service.documents

import no.nav.neessi.api.integration.rina.service.RinaIntegrationService
import org.springframework.stereotype.Service
import java.util.*

@Service
class DocumentService(
    val rinaIntegrationService: RinaIntegrationService
) {

    fun put(internationalId: String, documentId: UUID, sedType: String, document: Any) {
        rinaIntegrationService.put(internationalId, documentId, sedType, document)
    }
}
