package no.nav.neessi.webapp.v43.s040

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.api.service.documents.DocumentService
import no.nav.neessi.openapi.api.v43.S040Api
import no.nav.neessi.openapi.model.v43.S040Type
import no.nav.security.token.support.core.api.Unprotected
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class S040V43ApiImpl(
    val documentService: DocumentService,
) : S040Api {

    val log = logger {}

    @Unprotected
    override fun getS040v43(
        setId: UUID,
        internationalId: String
    ): ResponseEntity<S040Type> {
        val s040 = documentService.get(internationalId, setId)
        return ResponseEntity(s040.toS040Type(), HttpStatus.OK)
    }

    @Unprotected
    override fun putS040v43(
        setId: UUID,
        internationalId: String,
        s040Type: S040Type
    ): ResponseEntity<Unit> {
        val s040 = s040Type.toS040()
        documentService.put(internationalId, setId, "S040", s040)
        return ResponseEntity(HttpStatus.OK)
    }

}
