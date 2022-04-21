package br.com.indiotec.apps.siscon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table
public class Habitation extends AbstractEntity {

    @Column(name = "block")
    private String block;

    @Column(name = "floor")
    private String floor;

    @Column(name = "number")
    private String number;

    @Column(name = "type")
    private String type;

    @OneToMany(mappedBy = "habitation")
    private List<ResidentHabitation> residentHabitations;

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<ResidentHabitation> getResidentHabitations() {
        return residentHabitations;
    }

    public void setResidentHabitations(List<ResidentHabitation> residentHabitations) {
        this.residentHabitations = residentHabitations;
    }
}
