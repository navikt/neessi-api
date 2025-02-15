package no.nav.neessi.webapp.v43

import io.github.oshai.kotlinlogging.KotlinLogging.logger
import no.nav.neessi.openapi.v43.api.S040Api
import no.nav.neessi.openapi.v43.model.S040Type
import no.nav.security.token.support.core.api.Protected
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
class S040ApiImpl : S040Api {

    val log = logger {}

    @Protected
    override fun getS040(instanceIdentifier: UUID): ResponseEntity<S040Type> {
        log.info { "heio" }
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

}