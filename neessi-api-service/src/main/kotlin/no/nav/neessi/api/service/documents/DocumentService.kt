package no.nav.neessi.api.service.documents

import no.nav.model.v43.document.s040.S040
import no.nav.neessi.api.integration.rina.service.RinaIntegrationService
import org.springframework.stereotype.Service
import java.util.*

@Service
class DocumentService(
    val rinaIntegrationService: RinaIntegrationService
) {

    fun put(internationalId: String, setId: UUID, sedType: String, document: Any) {
        rinaIntegrationService.put(internationalId, setId, sedType, document)
    }

    fun get(internationalId: String, setId: UUID): S040 {
        TODO()
    }
}
