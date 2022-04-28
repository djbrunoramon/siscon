package br.com.indiotec.apps.siscon.dtos.views;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CondominiumAreasView implements Serializable {
    private final Long id;
    private final String name;
    private final String description;
    private final boolean active;
    private final boolean inMaintenance;
    private final BigDecimal area;

    public CondominiumAreasView(Long id, String name, String description, boolean active, boolean inMaintenance, BigDecimal area) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.active = active;
        this.inMaintenance = inMaintenance;
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean getActive() {
        return active;
    }

    public boolean getInMaintenance() {
        return inMaintenance;
    }

    public BigDecimal getArea() {
        return area;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CondominiumAreasView entity = (CondominiumAreasView) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.name, entity.name) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.active, entity.active) &&
                Objects.equals(this.inMaintenance, entity.inMaintenance) &&
                Objects.equals(this.area, entity.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, active, inMaintenance, area);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "active = " + active + ", " +
                "inMaintenance = " + inMaintenance + ", " +
                "area = " + area + ")";
    }
}
