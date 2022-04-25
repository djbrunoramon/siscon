package br.com.indiotec.apps.siscon.dtos;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Objects;

public class HabitationDto implements Serializable {
    private final String block;
    private final String floor;
    @NotBlank
    private final String number;
    @NotBlank
    private final String type;

    public HabitationDto(String block, String floor, String number, String type) {
        this.block = block;
        this.floor = floor;
        this.number = number;
        this.type = type;
    }

    public String getBlock() {
        return block;
    }

    public String getFloor() {
        return floor;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitationDto entity = (HabitationDto) o;
        return Objects.equals(this.block, entity.block) &&
                Objects.equals(this.floor, entity.floor) &&
                Objects.equals(this.number, entity.number) &&
                Objects.equals(this.type, entity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(block, floor, number, type);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "block = " + block + ", " +
                "floor = " + floor + ", " +
                "number = " + number + ", " +
                "type = " + type + ")";
    }
}
