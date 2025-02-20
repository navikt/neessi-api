package no.nav.neessi.api.integration.rina.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestClient

@Configuration
class IntegrationConfig {

    @Bean
    fun cpiRestClient(
        properties: RinaCpiServiceProperties,
        interceptor: AuthenticationInterceptor
    ) =
        RestClient
            .builder()
            .baseUrl("${properties.rinaBaseUrl}/eessiRest/")
            .requestInterceptor(interceptor)
            .build()

    @Bean
    fun authenticationInterceptor(
        rinaCpiServiceProperties: RinaCpiServiceProperties,
        serviceuserCredentials: ServiceuserCredentials
    ) =
        AuthenticationInterceptor(rinaCpiServiceProperties, serviceuserCredentials)

}