package br.com.indiotec.apps.siscon.dtos.views;

import java.io.Serializable;
import java.util.Objects;

public class HabitationView implements Serializable {
    private final Long id;
    private final String block;
    private final String floor;
    private final String number;
    private final String type;

    public HabitationView(Long id, String block, String floor, String number, String type) {
        this.id = id;
        this.block = block;
        this.floor = floor;
        this.number = number;
        this.type = type;
    }

    public Long getId() {
        return id;
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
        HabitationView entity = (HabitationView) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.block, entity.block) &&
                Objects.equals(this.floor, entity.floor) &&
                Objects.equals(this.number, entity.number) &&
                Objects.equals(this.type, entity.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, block, floor, number, type);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "block = " + block + ", " +
                "floor = " + floor + ", " +
                "number = " + number + ", " +
                "type = " + type + ")";
    }
}
