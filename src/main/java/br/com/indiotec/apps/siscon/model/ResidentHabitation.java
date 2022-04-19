package br.com.indiotec.apps.siscon.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ResidentHabitation extends AbstractEntity {

    @ManyToOne
    private Resident resident;

    @ManyToOne
    private Habitation habitation;

    private boolean owner;

    private LocalDateTime createdAt;
}
