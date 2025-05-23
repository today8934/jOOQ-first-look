/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.math.BigDecimal;

import org.jooq.generated.tables.JSalesByStore;
import org.jooq.generated.tables.pojos.SalesByStore;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class SalesByStoreRecord extends TableRecordImpl<SalesByStoreRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.sales_by_store.store</code>.
     */
    public SalesByStoreRecord setStore(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.store</code>.
     */
    public String getStore() {
        return (String) get(0);
    }

    /**
     * Setter for <code>sakila.sales_by_store.manager</code>.
     */
    public SalesByStoreRecord setManager(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.manager</code>.
     */
    public String getManager() {
        return (String) get(1);
    }

    /**
     * Setter for <code>sakila.sales_by_store.total_sales</code>.
     */
    public SalesByStoreRecord setTotalSales(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.sales_by_store.total_sales</code>.
     */
    public BigDecimal getTotalSales() {
        return (BigDecimal) get(2);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalesByStoreRecord
     */
    public SalesByStoreRecord() {
        super(JSalesByStore.SALES_BY_STORE);
    }

    /**
     * Create a detached, initialised SalesByStoreRecord
     */
    public SalesByStoreRecord(String store, String manager, BigDecimal totalSales) {
        super(JSalesByStore.SALES_BY_STORE);

        setStore(store);
        setManager(manager);
        setTotalSales(totalSales);
        resetTouchedOnNotNull();
    }

    /**
     * Create a detached, initialised SalesByStoreRecord
     */
    public SalesByStoreRecord(SalesByStore value) {
        super(JSalesByStore.SALES_BY_STORE);

        if (value != null) {
            setStore(value.getStore());
            setManager(value.getManager());
            setTotalSales(value.getTotalSales());
            resetTouchedOnNotNull();
        }
    }
}
