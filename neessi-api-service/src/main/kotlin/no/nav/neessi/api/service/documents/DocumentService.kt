package no.nav.neessi.api.service.documents

import no.nav.model.v43.document.s040.S040
import no.nav.neessi.api.integration.rina.service.RinaIntegrationService
import org.springframework.stereotype.Service

@Service
class DocumentService(
    val rinaIntegrationService: RinaIntegrationService
) {


    /*
        Denne klassen føles overflødig, spesielt hvis vi ikke får den generisk,
        argument for å ikke ha  egen domenemodell og service lag
     */

    fun put(internationalId: String, setId: String, sedType: String, document: Any) {
        rinaIntegrationService.put(internationalId, setId, sedType, document)
    }

    fun getS040(internationalId: String, setId: String): S040 {
        return rinaIntegrationService.getS040(internationalId, setId)
    }

}
