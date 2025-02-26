package no.nav.neessi.api.integration.rina.model.case
import com.fasterxml.jackson.annotation.JsonFormat
import java.time.Instant
import java.time.LocalDate
import java.util.*

/*
    ikke CDM versjonshåndtert - tanker?
 */

data class RinaCase(
    val id: Long,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
    val startDate: Instant?,
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
    val lastUpdate: Instant?,
    val status: String?,
    val subject: Subject?,
    val sensitive: Boolean?,
    val sensitiveCommitted: Boolean?,
    val creator: Creator?,
    val actions: List<Action>?,
    val documents: List<Document>?,
    val attachments: List<Attachment>?,
    val participants: List<Participant>?,
    val processDefinitionName: String?,
    val processDefinitionVersion: String?,
    val applicationRoleId: String?,
    val comments: List<Comment>?,
    val businessId: String?,
    val internationalId: String?,
    val properties: Properties?,
    val caseType: String?
) {
    data class Subject(
        val pid: String?,
        val name: String?,
        val surname: String?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
        val birthday: LocalDate?,
        val sex: String?
    )

    data class Creator(
        val id: String?,
        val type: String?,
        val name: String?,
        val organisation: Organisation?
    )

    data class Organisation(
        val id: String?,
        val registryNumber: String?,
        val name: String?,
        val acronym: String?,
        val countryCode: String?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
        val activeSince: Instant?
    )

    data class Action(
        val id: UUID,
        val name: String?,
        val displayName: String?,
        val type: String?,
        val template: String?,
        val typeVersion: String?,
        val documentType: String?,
        val documentId: String?,
        val isCaseRelated: Boolean?,
        val hasBusinessValidation: Boolean?,
        val isBulk: Boolean?,
        val requiresValidDocument: Boolean?,
        val canClose: Boolean?,
        val isDocumentRelated: Boolean?,
        val actor: String?,
        val caseId: String?,
        val operation: String?,
        val status: String?,
        val actionGroup: ActionGroup?,
        val poolGroup: ActionGroup?,
        val hasSendValidationOnBulk: Boolean?,
        val tags: Tags?,
        val bulk: Boolean?,
        val caseRelated: Boolean?,
        val documentRelated: Boolean?
    )

    data class ActionGroup(
        val hasLocalClose: Boolean?,
        val DMProcessId: String?,
        val Operation: String?,
        val DocumentId: String?,
        val Type: String?
    )

    data class Tags(
        val category: String?,
        val type: String?
    )

    data class Document(
        val id: String?,
        val name: String?,
        val mimeType: String?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
        val lastUpdate: Instant?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
        val creationDate: Instant?,
        val creator: Creator?,
        val hasMultipleVersions: Boolean?,
        val versions: List<Version>?,
        val toSenderOnly: Boolean?,
        val isAdmin: Boolean?,
        val selectParticipants: Boolean?,
        val hasReplyClarify: Boolean?,
        val hasReject: Boolean?,
        val hasLetter: Boolean?,
        val hasClarify: Boolean?,
        val hasCancel: Boolean?,
        val type: String?,
        val typeVersion: String?,
        val displayName: String?,
        val starter: Boolean?,
        val direction: String?,
        val status: String?,
        val comments: List<Comment>?,
        val attachments: List<Attachment>?,
        val conversations: List<Conversation>?,
        val bulk: Boolean?,
        val validation: Validation?,
        val hasBusinessValidation: Boolean?,
        val allowsAttachments: Boolean?,
        val isDummyDocument: Boolean?,
        val canBeSentWithoutChild: Boolean?,
        val isFirstDocument: Boolean?,
        val isMLC: Boolean?,
        val isSendExecuted: Boolean?,
        val order: Int?,
        val admin: Boolean?,
        val dummyDocument: Boolean?,
        val firstDocument: Boolean?,
        val sendExecuted: Boolean?,
        val mlc: Boolean?
    )

    data class Version(
        val id: String?,
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSX")
        val date: Instant?,
        val user: Creator?
    )

    data class Conversation(
        val id: String?,
        val participants: List<ConversationParticipant>?
    )

    data class ConversationParticipant(
        val role: String?,
        val organisation: Organisation?,
        val selected: Boolean?
    )

    data class Validation(
        val status: String?,
        val messages: List<ValidationMessage>?
    )

    data class ValidationMessage(
        val path: String?,
        val level: String?,
        val message: String?
    )

    data class Participant(
        val role: String?,
        val organisation: Organisation?,
        val selected: Boolean?
    )

    data class Attachment(
        val id: String?
    )

    data class Comment(
        val id: String?,
        val text: String?
    )

    data class Properties(
        val importance: String?,
        val criticality: String?
    )
}
