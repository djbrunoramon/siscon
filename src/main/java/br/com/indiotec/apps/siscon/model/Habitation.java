package br.com.indiotec.apps.siscon.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
public class Habitation extends AbstractEntity {

    @Column(name = "block")
    private String block;

    @Column(name = "floor")
    private String floor;

    @Column(name = "number")
    private String number;

    @Column(name = "type")
    private String type;
}
