package br.com.indiotec.apps.siscon.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CondominiumAreasDto implements Serializable {

    @NotBlank
    private final String name;
    @NotBlank
    private final String description;

    @NotNull
    private final boolean active;
    private final boolean inMaintenance;
    private final BigDecimal area;

    public CondominiumAreasDto(String name, String description, boolean active, boolean inMaintenance, BigDecimal area) {
        this.name = name;
        this.description = description;
        this.active = active;
        this.inMaintenance = inMaintenance;
        this.area = area;
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
        CondominiumAreasDto entity = (CondominiumAreasDto) o;
        return Objects.equals(this.name, entity.name) &&
                Objects.equals(this.description, entity.description) &&
                Objects.equals(this.active, entity.active) &&
                Objects.equals(this.inMaintenance, entity.inMaintenance) &&
                Objects.equals(this.area, entity.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, active, inMaintenance, area);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "name = " + name + ", " +
                "description = " + description + ", " +
                "active = " + active + ", " +
                "inMaintenance = " + inMaintenance + ", " +
                "area = " + area + ")";
    }
}
