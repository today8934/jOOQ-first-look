/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.records;


import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.generated.tables.JPayment;
import org.jooq.generated.tables.pojos.Payment;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>sakila.payment.payment_id</code>.
     */
    public PaymentRecord setPaymentId(Long value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.payment_id</code>.
     */
    public Long getPaymentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>sakila.payment.customer_id</code>.
     */
    public PaymentRecord setCustomerId(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>sakila.payment.staff_id</code>.
     */
    public PaymentRecord setStaffId(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.staff_id</code>.
     */
    public Long getStaffId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>sakila.payment.rental_id</code>.
     */
    public PaymentRecord setRentalId(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.rental_id</code>.
     */
    public Integer getRentalId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>sakila.payment.amount</code>.
     */
    public PaymentRecord setAmount(BigDecimal value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>sakila.payment.payment_date</code>.
     */
    public PaymentRecord setPaymentDate(LocalDateTime value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.payment_date</code>.
     */
    public LocalDateTime getPaymentDate() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>sakila.payment.last_update</code>.
     */
    public PaymentRecord setLastUpdate(LocalDateTime value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>sakila.payment.last_update</code>.
     */
    public LocalDateTime getLastUpdate() {
        return (LocalDateTime) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(JPayment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Long paymentId, Long customerId, Long staffId, Integer rentalId, BigDecimal amount, LocalDateTime paymentDate, LocalDateTime lastUpdate) {
        super(JPayment.PAYMENT);

        setPaymentId(paymentId);
        setCustomerId(customerId);
        setStaffId(staffId);
        setRentalId(rentalId);
        setAmount(amount);
        setPaymentDate(paymentDate);
        setLastUpdate(lastUpdate);
        resetTouchedOnNotNull();
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Payment value) {
        super(JPayment.PAYMENT);

        if (value != null) {
            setPaymentId(value.getPaymentId());
            setCustomerId(value.getCustomerId());
            setStaffId(value.getStaffId());
            setRentalId(value.getRentalId());
            setAmount(value.getAmount());
            setPaymentDate(value.getPaymentDate());
            setLastUpdate(value.getLastUpdate());
            resetTouchedOnNotNull();
        }
    }
}
