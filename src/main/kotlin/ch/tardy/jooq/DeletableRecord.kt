package ch.tardy.jooq

interface DeletableRecord {
    companion object {
        const val DELETED_FIELD_NAME = "deleted"
    }

    var deleted: Boolean?
}
