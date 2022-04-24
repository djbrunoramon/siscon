package br.com.indiotec.apps.siscon.repository;

import br.com.indiotec.apps.siscon.model.ResidentHabitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResidentHabitationRepository extends JpaRepository<ResidentHabitation, Long> {
}