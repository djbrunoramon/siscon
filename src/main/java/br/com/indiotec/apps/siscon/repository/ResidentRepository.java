package br.com.indiotec.apps.siscon.repository;

import br.com.indiotec.apps.siscon.model.Resident;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResidentRepository extends JpaRepository<Resident, Long> {
}