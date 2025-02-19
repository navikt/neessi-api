package no.nav.neessi

import no.nav.neessi.api.integration.rina.config.RinaCpiServiceProperties
import no.nav.neessi.api.integration.rina.config.ServiceuserCredentials
import no.nav.security.token.support.spring.api.EnableJwtTokenValidation
import org.openapitools.SpringDocConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Import

@EnableJwtTokenValidation(
    ignore = [
        "org.springframework",
        "org.springdoc"
    ]
)
@SpringBootApplication
@Import(value = [SpringDocConfiguration::class])
@EnableConfigurationProperties(RinaCpiServiceProperties::class, ServiceuserCredentials::class)
class Application

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
