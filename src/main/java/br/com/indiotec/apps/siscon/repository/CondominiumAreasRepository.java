package br.com.indiotec.apps.siscon.repository;

import br.com.indiotec.apps.siscon.model.CondominiumAreas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondominiumAreasRepository extends JpaRepository<CondominiumAreas, Long> {
}