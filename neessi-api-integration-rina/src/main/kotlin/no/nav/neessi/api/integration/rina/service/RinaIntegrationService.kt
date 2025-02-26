package no.nav.neessi.api.integration.rina.service

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.model.v43.document.s040.S040
import no.nav.neessi.api.integration.rina.client.CpiCasesClient
import no.nav.neessi.api.integration.rina.client.CpiDocumentClient
import no.nav.neessi.api.integration.rina.client.RinaActionsClient
import no.nav.neessi.api.integration.rina.model.case.RinaCase
import no.nav.neessi.api.integration.rina.model.v43.documents.s040.s040Model
import org.springframework.stereotype.Service

@Service
class RinaIntegrationService(
    val casesClient: CpiCasesClient,
    val actionsClient: RinaActionsClient,
    val documentClient: CpiDocumentClient
) {

    val log = logger {}


    /*
     * slik put er laget her skalerer okei, men det blir
     * veldig rotete med egen funksjon for S040 og alle andre SED (og versjoner av disse)
     */


    fun put(internationalId: String, setId: String, sedType: String, document: Any) {
        log.info { "Creating document $setId in $internationalId "  }
        val rinaCase = casesClient.getCase(internationalId)
        log.info { "Found caseId ${rinaCase.id} for $internationalId" }
        val action = rinaCase.getAction("Update", sedType)
        log.info { "found action ${action.id} for $internationalId" }
        actionsClient.documentAction(rinaCase.id, action.id, document.rinaModel)
        log.info { "Successfully performed action for $internationalId" }
    }

    fun getS040(internationalId: String, setId: String): S040 {
        log.info { "Get for $internationalId" }
        val rinaCase = casesClient.getCase(internationalId)
        log.info { "Rina case: ${rinaCase.id}" }
        return documentClient.getDocument(rinaCase.id, setId).s040Model
    }

    fun RinaCase.getAction(operation: String, template: String) =
        actions
            ?.firstOrNull { it.operation == operation && it.template == template }
            ?: throw RuntimeException("No action found in international case for update of document")
}
