package no.nav.neessi.api.service.documents

import no.nav.model.v43.document.s040.S040
import no.nav.neessi.api.integration.rina.service.RinaIntegrationService
import org.springframework.core.ParameterizedTypeReference
import org.springframework.stereotype.Service

@Service
class DocumentService(
    val rinaIntegrationService: RinaIntegrationService
) {

    fun put(internationalId: String, setId: String, sedType: String, document: Any) {
        rinaIntegrationService.put(internationalId, setId, sedType, document)
    }

    fun get(internationalId: String, setId: String): S040 {
        return rinaIntegrationService.get(internationalId, setId, object : ParameterizedTypeReference<S040>() {})
    }
}
