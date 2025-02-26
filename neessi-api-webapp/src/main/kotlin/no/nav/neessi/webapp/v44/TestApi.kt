package no.nav.neessi.webapp.v44

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.responses.ApiResponse
import no.nav.neessi.api.integration.rina.client.TestCpiClient
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
    val testCpiClient: TestCpiClient
) {

    /*
        midlertidig for å teste CPI og finne ut hvilke APIer som burde brukes
     */


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
        val body = testCpiClient.postTest(payload)
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
        val body = testCpiClient.getTest(payload)
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
        val body = testCpiClient.putTest(payload)
        return ResponseEntity(body, HttpStatusCode.valueOf(200))
    }

}

