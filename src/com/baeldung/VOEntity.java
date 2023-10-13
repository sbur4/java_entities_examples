package com.baeldung;

import java.time.LocalDate;
import java.util.Objects;

public final class VOEntity {
    private final String firstName;
    private final String lastName;
    private final LocalDate startDate;

    public VOEntity(String firstName, String lastName, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        VOEntity emp = (VOEntity) obj;

        return Objects.equals(firstName, emp.firstName)
                && Objects.equals(lastName, emp.lastName)
                && Objects.equals(startDate, emp.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, startDate);
    }
}