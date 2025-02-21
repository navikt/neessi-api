package no.nav.neessi.api.integration.rina.service

import no.nav.neessi.api.integration.rina.model.v43.documents.s040.s040cpiRootModelV43
import no.nav.model.v43.S040 as S040_v43

val Any.rinaModel
    get() =
        when (this) {
            is S040_v43 -> s040cpiRootModelV43
            else -> throw IllegalArgumentException("No mapping found for $this")
        }
