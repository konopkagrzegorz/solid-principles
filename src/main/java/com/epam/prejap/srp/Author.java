package com.epam.prejap.srp;

import java.time.LocalDate;

public class Author {

    private String name;
    private LocalDate dateOfBirth;

    public Author(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;

        Author author = (Author) o;

        if (!name.equals(author.name)) return false;
        return dateOfBirth.equals(author.dateOfBirth);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + dateOfBirth.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return name + ", " + dateOfBirth.toString();
    }
}
