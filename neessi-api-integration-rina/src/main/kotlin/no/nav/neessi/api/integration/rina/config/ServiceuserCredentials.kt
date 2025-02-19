package no.nav.neessi.api.integration.rina.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "credentials")
class ServiceuserCredentials(
    val username: String,
    val password: String
)