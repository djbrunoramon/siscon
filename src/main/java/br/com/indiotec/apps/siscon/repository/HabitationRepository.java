package br.com.indiotec.apps.siscon.repository;

import br.com.indiotec.apps.siscon.model.Habitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitationRepository extends JpaRepository<Habitation, Long> {
}