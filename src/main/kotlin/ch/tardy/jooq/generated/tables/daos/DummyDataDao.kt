/*
 * This file is generated by jOOQ.
 */
package ch.tardy.jooq.generated.tables.daos


import ch.tardy.jooq.generated.tables.DummyData
import ch.tardy.jooq.generated.tables.pojos.DummyDataPojo
import ch.tardy.jooq.generated.tables.records.DummyDataRecord
import org.jooq.Configuration
import org.jooq.impl.DAOImpl
import java.time.OffsetDateTime


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
class DummyDataDao(configuration: Configuration?) : DAOImpl<DummyDataRecord, DummyDataPojo, Long>(DummyData.DUMMY_DATA, DummyDataPojo::class.java, configuration) {

    /**
     * Create a new DummyDataDao without any configuration
     */
    constructor() : this(null)

    override fun getId(o: DummyDataPojo): Long? = o.id

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfId(lowerInclusive: Long?, upperInclusive: Long?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.ID, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    fun fetchById(vararg values: Long): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.ID, *values.toTypedArray())

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    fun fetchOneById(value: Long): DummyDataPojo? = fetchOne(DummyData.DUMMY_DATA.ID, value)

    /**
     * Fetch records that have <code>numbers BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfNumbers(lowerInclusive: Array<java.lang.Long?>?, upperInclusive: Array<java.lang.Long?>?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.NUMBERS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>numbers IN (values)</code>
     */
    fun fetchByNumbers(vararg values: Array<java.lang.Long?>): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.NUMBERS, *values)

    /**
     * Fetch records that have <code>strings BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfStrings(lowerInclusive: Array<java.lang.String?>?, upperInclusive: Array<java.lang.String?>?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.STRINGS, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>strings IN (values)</code>
     */
    fun fetchByStrings(vararg values: Array<java.lang.String?>): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.STRINGS, *values)

    /**
     * Fetch records that have <code>deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfDeleted(lowerInclusive: Boolean?, upperInclusive: Boolean?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.DELETED, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    fun fetchByDeleted(vararg values: Boolean): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.DELETED, *values.toTypedArray())

    /**
     * Fetch records that have <code>created_by BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfCreatedBy(lowerInclusive: String?, upperInclusive: String?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.CREATED_BY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created_by IN (values)</code>
     */
    fun fetchByCreatedBy(vararg values: String): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.CREATED_BY, *values)

    /**
     * Fetch records that have <code>created_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfCreatedDate(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.CREATED_DATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>created_date IN (values)</code>
     */
    fun fetchByCreatedDate(vararg values: OffsetDateTime): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.CREATED_DATE, *values)

    /**
     * Fetch records that have <code>last_modified_by BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfLastModifiedBy(lowerInclusive: String?, upperInclusive: String?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.LAST_MODIFIED_BY, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>last_modified_by IN (values)</code>
     */
    fun fetchByLastModifiedBy(vararg values: String): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.LAST_MODIFIED_BY, *values)

    /**
     * Fetch records that have <code>last_modified_date BETWEEN lowerInclusive AND upperInclusive</code>
     */
    fun fetchRangeOfLastModifiedDate(lowerInclusive: OffsetDateTime?, upperInclusive: OffsetDateTime?): List<DummyDataPojo> = fetchRange(DummyData.DUMMY_DATA.LAST_MODIFIED_DATE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>last_modified_date IN (values)</code>
     */
    fun fetchByLastModifiedDate(vararg values: OffsetDateTime): List<DummyDataPojo> = fetch(DummyData.DUMMY_DATA.LAST_MODIFIED_DATE, *values)
}
