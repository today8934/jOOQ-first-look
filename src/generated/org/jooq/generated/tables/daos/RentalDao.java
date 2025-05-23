/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.JRental;
import org.jooq.generated.tables.pojos.Rental;
import org.jooq.generated.tables.records.RentalRecord;
import org.jooq.impl.AutoConverter;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class RentalDao extends DAOImpl<RentalRecord, Rental, Integer> {

    /**
     * Create a new RentalDao without any configuration
     */
    public RentalDao() {
        super(JRental.RENTAL, Rental.class);
    }

    /**
     * Create a new RentalDao with an attached configuration
     */
    public RentalDao(Configuration configuration) {
        super(JRental.RENTAL, Rental.class, configuration);
    }

    @Override
    public Integer getId(Rental object) {
        return object.getRentalId();
    }

    /**
     * Fetch records that have <code>rental_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfRentalId(Integer lowerInclusive, Integer upperInclusive) {
        return fetchRange(JRental.RENTAL.RENTAL_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_id IN (values)</code>
     */
    public List<Rental> fetchByRentalId(Integer... values) {
        return fetch(JRental.RENTAL.RENTAL_ID, values);
    }

    /**
     * Fetch a unique record that has <code>rental_id = value</code>
     */
    public Rental fetchOneByRentalId(Integer value) {
        return fetchOne(JRental.RENTAL.RENTAL_ID, value);
    }

    /**
     * Fetch a unique record that has <code>rental_id = value</code>
     */
    public Optional<Rental> fetchOptionalByRentalId(Integer value) {
        return fetchOptional(JRental.RENTAL.RENTAL_ID, value);
    }

    /**
     * Fetch records that have <code>rental_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfRentalDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JRental.RENTAL.RENTAL_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>rental_date IN (values)</code>
     */
    public List<Rental> fetchByRentalDate(LocalDateTime... values) {
        return fetch(JRental.RENTAL.RENTAL_DATE, values);
    }

    /**
     * Fetch records that have <code>inventory_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfInventoryId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JRental.RENTAL.INVENTORY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>inventory_id IN (values)</code>
     */
    public List<Rental> fetchByInventoryId(Long... values) {
        return fetch(JRental.RENTAL.INVENTORY_ID, values);
    }

    /**
     * Fetch records that have <code>customer_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfCustomerId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JRental.RENTAL.CUSTOMER_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>customer_id IN (values)</code>
     */
    public List<Rental> fetchByCustomerId(Long... values) {
        return fetch(JRental.RENTAL.CUSTOMER_ID, values);
    }

    /**
     * Fetch records that have <code>return_date BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfReturnDate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JRental.RENTAL.RETURN_DATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>return_date IN (values)</code>
     */
    public List<Rental> fetchByReturnDate(LocalDateTime... values) {
        return fetch(JRental.RENTAL.RETURN_DATE, values);
    }

    /**
     * Fetch records that have <code>staff_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfStaffId(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(JRental.RENTAL.STAFF_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>staff_id IN (values)</code>
     */
    public List<Rental> fetchByStaffId(Long... values) {
        return fetch(JRental.RENTAL.STAFF_ID, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<Rental> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(JRental.RENTAL.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<Rental> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(JRental.RENTAL.LAST_UPDATE, values);
    }
}
