package ch.tardy.jooq

import java.time.OffsetDateTime

interface AuditableRecord {
    companion object {
        const val CREATED_DATE_FIELD_NAME = "created_date"
        const val LAST_MODIFIED_DATE_FIELD_NAME = "last_modified_date"
    }

    var createdBy: String?
    var createdDate: OffsetDateTime?

    var lastModifiedBy: String?
    var lastModifiedDate: OffsetDateTime?
}
