package br.com.indiotec.apps.siscon.dtos.views;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class ResidentHabitationView implements Serializable {
    private final Long id;
    private final Long residentId;
    private final String residentFirstName;
    private final String residentLastName;
    private final LocalDate residentBirthDate;
    private final String residentContact;
    private final Long habitationId;
    private final String habitationBlock;
    private final String habitationFloor;
    private final String habitationNumber;
    private final String habitationType;
    private final boolean owner;

    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm")
    private final LocalDateTime createdAt;

    public ResidentHabitationView(Long id, Long residentId, String residentFirstName, String residentLastName, LocalDate residentBirthDate, String residentContact, Long habitationId, String habitationBlock, String habitationFloor, String habitationNumber, String habitationType, boolean owner, LocalDateTime createdAt) {
        this.id = id;
        this.residentId = residentId;
        this.residentFirstName = residentFirstName;
        this.residentLastName = residentLastName;
        this.residentBirthDate = residentBirthDate;
        this.residentContact = residentContact;
        this.habitationId = habitationId;
        this.habitationBlock = habitationBlock;
        this.habitationFloor = habitationFloor;
        this.habitationNumber = habitationNumber;
        this.habitationType = habitationType;
        this.owner = owner;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public Long getResidentId() {
        return residentId;
    }

    public String getResidentFirstName() {
        return residentFirstName;
    }

    public String getResidentLastName() {
        return residentLastName;
    }

    public LocalDate getResidentBirthDate() {
        return residentBirthDate;
    }

    public String getResidentContact() {
        return residentContact;
    }

    public Long getHabitationId() {
        return habitationId;
    }

    public String getHabitationBlock() {
        return habitationBlock;
    }

    public String getHabitationFloor() {
        return habitationFloor;
    }

    public String getHabitationNumber() {
        return habitationNumber;
    }

    public String getHabitationType() {
        return habitationType;
    }

    public boolean getOwner() {
        return owner;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentHabitationView entity = (ResidentHabitationView) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.residentId, entity.residentId) &&
                Objects.equals(this.residentFirstName, entity.residentFirstName) &&
                Objects.equals(this.residentLastName, entity.residentLastName) &&
                Objects.equals(this.residentBirthDate, entity.residentBirthDate) &&
                Objects.equals(this.residentContact, entity.residentContact) &&
                Objects.equals(this.habitationId, entity.habitationId) &&
                Objects.equals(this.habitationBlock, entity.habitationBlock) &&
                Objects.equals(this.habitationFloor, entity.habitationFloor) &&
                Objects.equals(this.habitationNumber, entity.habitationNumber) &&
                Objects.equals(this.habitationType, entity.habitationType) &&
                Objects.equals(this.owner, entity.owner) &&
                Objects.equals(this.createdAt, entity.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, residentId, residentFirstName, residentLastName, residentBirthDate, residentContact, habitationId, habitationBlock, habitationFloor, habitationNumber, habitationType, owner, createdAt);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "residentId = " + residentId + ", " +
                "residentFirstName = " + residentFirstName + ", " +
                "residentLastName = " + residentLastName + ", " +
                "residentBirthDate = " + residentBirthDate + ", " +
                "residentContact = " + residentContact + ", " +
                "habitationId = " + habitationId + ", " +
                "habitationBlock = " + habitationBlock + ", " +
                "habitationFloor = " + habitationFloor + ", " +
                "habitationNumber = " + habitationNumber + ", " +
                "habitationType = " + habitationType + ", " +
                "owner = " + owner + ", " +
                "createdAt = " + createdAt + ")";
    }
}
