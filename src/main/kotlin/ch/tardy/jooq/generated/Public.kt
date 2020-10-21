/*
 * This file is generated by jOOQ.
 */
package ch.tardy.jooq.generated


import ch.tardy.jooq.generated.sequences.DUMMY_DATA_ID_SEQ
import ch.tardy.jooq.generated.tables.DummyData
import org.jooq.Catalog
import org.jooq.Sequence
import org.jooq.Table
import org.jooq.impl.SchemaImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class Public : SchemaImpl("public", DefaultCatalog.DEFAULT_CATALOG) {
    companion object {

        /**
         * The reference instance of <code>public</code>
         */
        val PUBLIC = Public()
    }

    /**
     * The table <code>public.dummy_data</code>.
     */
    val DUMMY_DATA get() = DummyData.DUMMY_DATA

    override fun getCatalog(): Catalog = DefaultCatalog.DEFAULT_CATALOG

    override fun getSequences(): List<Sequence<*>> = listOf(
            DUMMY_DATA_ID_SEQ
    )

    override fun getTables(): List<Table<*>> = listOf(
            DummyData.DUMMY_DATA
    )
}