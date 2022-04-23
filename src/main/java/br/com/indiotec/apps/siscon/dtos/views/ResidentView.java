package br.com.indiotec.apps.siscon.dtos.views;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class ResidentView implements Serializable {
    private final Long id;
    private final String firstName;
    private final String lastName;
    private final LocalDate birthDate;
    private final String contact;

    public ResidentView(Long id, String firstName, String lastName, LocalDate birthDate, String contact) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.contact = contact;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentView entity = (ResidentView) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.firstName, entity.firstName) &&
                Objects.equals(this.lastName, entity.lastName) &&
                Objects.equals(this.birthDate, entity.birthDate) &&
                Objects.equals(this.contact, entity.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, birthDate, contact);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "firstName = " + firstName + ", " +
                "lastName = " + lastName + ", " +
                "birthDate = " + birthDate + ", " +
                "contact = " + contact + ")";
    }
}
