/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.JRental;
import org.jooq.generated.tables.pojos.Rental;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RentalRecord extends UpdatableRecordImpl<RentalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.rental.rental_id</code>.
     */
    public RentalRecord setRentalId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>sakila.rental.rental_date</code>.
     */
    public RentalRecord setRentalDate(LocalDateTime value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.rental_date</code>.
     */
    public LocalDateTime getRentalDate() {
        return (LocalDateTime) get(1);
    }

    /**
     * Setter for <code>sakila.rental.inventory_id</code>.
     */
    public RentalRecord setInventoryId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.inventory_id</code>.
     */
    public Long getInventoryId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>sakila.rental.customer_id</code>.
     */
    public RentalRecord setCustomerId(Long value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>sakila.rental.return_date</code>.
     */
    public RentalRecord setReturnDate(LocalDateTime value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.return_date</code>.
     */
    public LocalDateTime getReturnDate() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>sakila.rental.staff_id</code>.
     */
    public RentalRecord setStaffId(Long value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.staff_id</code>.
     */
    public Long getStaffId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>sakila.rental.last_update</code>.
     */
    public RentalRecord setLastUpdate(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.rental.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached RentalRecord
     */
    public RentalRecord() {
        super(JRental.RENTAL);
    }

    /**
     * Create a detached, initialised RentalRecord
     */
    public RentalRecord(Integer rentalId, LocalDateTime rentalDate, Long inventoryId, Long customerId, LocalDateTime returnDate, Long staffId, LocalDateTime lastUpdate) {
        super(JRental.RENTAL);

        setRentalId(rentalId);
        setRentalDate(rentalDate);
        setInventoryId(inventoryId);
        setCustomerId(customerId);
        setReturnDate(returnDate);
        setStaffId(staffId);
        setLastUpdate(lastUpdate);
        resetTouchedOnNotNull();
    }

    /**
     * Create a detached, initialised RentalRecord
     */
    public RentalRecord(Rental value) {
        super(JRental.RENTAL);

        if (value != null) {
            setRentalId(value.getRentalId());
            setRentalDate(value.getRentalDate());
            setInventoryId(value.getInventoryId());
            setCustomerId(value.getCustomerId());
            setReturnDate(value.getReturnDate());
            setStaffId(value.getStaffId());
            setLastUpdate(value.getLastUpdate());
            resetTouchedOnNotNull();
        }
    }
}
