package no.nav.neessi.webapp.v43.s040

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.api.service.documents.v43.s040.S040V43Service
import no.nav.neessi.openapi.api.v43.S040Api
import no.nav.neessi.openapi.model.v43.S040Type
import no.nav.neessi.webapp.v43.mapper.toS040
import no.nav.security.token.support.core.api.Unprotected
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class S040V43ApiImpl(
    val s040V43Service: S040V43Service
) : S040Api {

    val log = logger {}

    @Unprotected
    override fun getS040v43(
        documentId: UUID,
        internationalId: String
    ): ResponseEntity<S040Type> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Unprotected
    override fun putS040v43(
        documentId: UUID,
        internationalId: String,
        s040Type: S040Type
    ): ResponseEntity<Unit> {
        val s040 = s040Type.toS040()
        s040V43Service.put(internationalId, documentId, "S040", s040)
        return ResponseEntity(HttpStatus.OK)
    }

}
