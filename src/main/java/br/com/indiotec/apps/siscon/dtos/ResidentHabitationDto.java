package br.com.indiotec.apps.siscon.dtos;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

public class ResidentHabitationDto implements Serializable {
    @NotNull
    private final Long residentId;
    @NotNull
    private final Long habitationId;
    @NotNull
    private final boolean owner;

    public ResidentHabitationDto(Long residentId, Long habitationId, boolean owner) {
        this.residentId = residentId;
        this.habitationId = habitationId;
        this.owner = owner;
    }

    public Long getResidentId() {
        return residentId;
    }

    public Long getHabitationId() {
        return habitationId;
    }

    public boolean getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResidentHabitationDto entity = (ResidentHabitationDto) o;
        return Objects.equals(this.residentId, entity.residentId) &&
                Objects.equals(this.habitationId, entity.habitationId) &&
                Objects.equals(this.owner, entity.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(residentId, habitationId, owner);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "residentId = " + residentId + ", " +
                "habitationId = " + habitationId + ", " +
                "owner = " + owner + ")";
    }
}
