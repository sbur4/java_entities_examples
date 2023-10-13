package com.baeldung;

import java.time.LocalDate;

/**
 * Plain Old Java Object
 */
public class PojoEntity {
    private String firstName;
    private String lastName;
    private LocalDate startDate;

    public PojoEntity(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String name() {
        return this.firstName + " " + this.lastName;
    }

    public LocalDate getStart() {
        return this.startDate;
    }
}