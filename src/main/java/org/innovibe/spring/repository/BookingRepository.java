package org.innovibe.spring.repository;

import lombok.AllArgsConstructor;
import org.innovibe.spring.model.TableBooking;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class BookingRepository {
    private JdbcTemplate jdbcTemplate;

    public boolean create(TableBooking tableBooking) {
        boolean result = false;

        int r = jdbcTemplate.update("insert into tablebooking(customer_name,guests,booking_date,contact,requests) values (?,?,?,?,?)",
        tableBooking.getCustomerName(),tableBooking.getGuests(),tableBooking.getBookingDate(),tableBooking.getContact(),tableBooking.getRequests()
                );

        return  r > 0 ? true : false;

    }
}
