package no.nav.neessi.api.integration.rina.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "no.nav.eux.rina.cpi")
class RinaCpiServiceProperties (
    val rinaBaseUrl: String,
    val replaceOld: String = "http",
    val replaceNew: String = "https"
)
