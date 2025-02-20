package no.nav.neessi.webapp

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.responses.ApiResponse
import no.nav.neessi.api.integration.rina.client.CpiClient
import no.nav.neessi.api.integration.rina.client.TestPayload
import no.nav.security.token.support.core.api.Unprotected
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod.POST
import org.springframework.web.bind.annotation.RestController

@RestController
class TestApi(
    val cpiClient: CpiClient
) {

    @Unprotected
    @Operation(
        summary = "summary",
        operationId = "operation",
        description = "desc",
        responses = [
            ApiResponse(
                responseCode = "204",
                description = "No content"
            ),
        ]
    )
    @RequestMapping(
        method = [POST],
        value = ["/test"],
        produces = ["application/json"]
    )
    fun test(
        @Parameter(description = "", required = true) @RequestBody
        payload: TestPayload
    ): ResponseEntity<String> {
        val body = cpiClient.postTest(payload)
        return ResponseEntity(body, HttpStatusCode.valueOf(200))
    }

    @Unprotected
    @Operation(
        summary = "summary",
        operationId = "operation",
        description = "desc",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "No content"
            ),
        ]
    )
    @RequestMapping(
        method = [POST],
        value = ["/testGet"],
        produces = ["application/json"]
    )
    fun testGet(
        @Parameter(description = "", required = true) @RequestBody
        payload: TestPayload
    ): ResponseEntity<String> {
        val body = cpiClient.getTest(payload)
        return ResponseEntity(body, HttpStatusCode.valueOf(200))
    }

    @Unprotected
    @Operation(
        summary = "summary",
        operationId = "operation",
        description = "desc",
        responses = [
            ApiResponse(
                responseCode = "200",
                description = "No content"
            ),
        ]
    )
    @RequestMapping(
        method = [POST],
        value = ["/testPut"],
        produces = ["application/json"]
    )
    fun testPut(
        @Parameter(description = "", required = true) @RequestBody
        payload: TestPayload
    ): ResponseEntity<String> {
        val body = cpiClient.putTest(payload)
        return ResponseEntity(body, HttpStatusCode.valueOf(200))
    }

}

