package no.nav.neessi.webapp.v43.s040

import no.nav.neessi.api.service.documents.DocumentService
import no.nav.neessi.openapi.api.v43.S040Api
import no.nav.neessi.openapi.model.v43.S040Type
import no.nav.security.token.support.core.api.Unprotected
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController

@RestController
class S040V43ApiImpl(
    val documentService: DocumentService,
) : S040Api {

    /*
        veldefinert API er veldig positivt, dette er delen av
        appliaksjonen jeg føler gjør arbeidet verdt det
     */

    @Unprotected
    override fun getS040v43(
        setId: String,
        internationalId: String
    ): ResponseEntity<S040Type> {
        val s040 = documentService.getS040(internationalId, setId)
        return ResponseEntity(s040.toS040Type(), HttpStatus.OK)
    }

    @Unprotected
    override fun putS040v43(
        setId: String,
        internationalId: String,
        s040Type: S040Type
    ): ResponseEntity<Unit> {
        val s040 = s040Type.toS040()
        documentService.put(internationalId, setId, "S040", s040)
        return ResponseEntity(HttpStatus.OK)
    }

}
