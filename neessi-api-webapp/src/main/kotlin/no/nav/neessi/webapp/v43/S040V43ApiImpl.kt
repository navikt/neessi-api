package no.nav.neessi.webapp.v43

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.openapi.api.v43.S040Api
import no.nav.neessi.openapi.model.v43.S040Type
import no.nav.security.token.support.core.api.Unprotected
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class S040V43ApiImpl : S040Api {

    val log = logger {}

    @Unprotected
    override fun getS040v43(
        setId: UUID,
        version: String
    ): ResponseEntity<S040Type> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

}
