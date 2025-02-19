package no.nav.neessi.api.service.documents.v43.s040

import no.nav.model.v43.S040
import no.nav.neessi.api.integration.rina.client.CpiClient
import org.springframework.stereotype.Service

@Service
class S040V43Service(
    val cpiClient: CpiClient
) {
    fun put(s040: S040) {
        cpiClient.put(s040)
    }
}
