package no.nav.neessi.api.integration.rina.service

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.api.integration.rina.client.CpiCasesClient
import no.nav.neessi.api.integration.rina.client.RinaActionsClient
import no.nav.neessi.api.integration.rina.model.case.RinaCase
import org.springframework.stereotype.Service
import java.util.*

@Service
class RinaIntegrationService(
    val casesClient: CpiCasesClient,
    val actionsClient: RinaActionsClient,
) {

    val log = logger {}

    fun put(internationalId: String, documentId: UUID, sedType: String, document: Any) {
        log.info { "Creating document $documentId in $internationalId "  }
        val rinaCase = casesClient.getCase(internationalId)
        log.info { "Found caseId ${rinaCase.id} for $internationalId" }
        val action = rinaCase.getAction("Update", sedType)
        log.info { "found action ${action.id} for $internationalId" }
        actionsClient.documentAction(rinaCase.id, action.id, document)
        log.info { "Successfully performed action for $internationalId" }
    }

    fun RinaCase.getAction(operation: String, template: String) =
        actions
            ?.firstOrNull { it.operation == operation && it.template == template }
            ?: throw RuntimeException("No action found in international case for update of document")
}