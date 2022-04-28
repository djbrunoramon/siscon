package br.com.indiotec.apps.siscon.services;

import br.com.indiotec.apps.siscon.dtos.CondominiumAreasDto;
import br.com.indiotec.apps.siscon.dtos.mapper.CondominiumAreasMapper;
import br.com.indiotec.apps.siscon.dtos.views.CondominiumAreasView;
import br.com.indiotec.apps.siscon.exception.IdNotFoundException;
import br.com.indiotec.apps.siscon.model.CondominiumAreas;
import br.com.indiotec.apps.siscon.repository.CondominiumAreasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CondominiumAreasService {

    @Autowired
    private CondominiumAreasRepository condominiumAreasRepository;

    @Autowired
    private CondominiumAreasMapper condominiumAreasMapper;

    public CondominiumAreasView save(CondominiumAreasDto condominiumAreasDto) {
        CondominiumAreas condominiumAreas = condominiumAreasMapper.condominiumAreasDtoToCondominiumAreas(condominiumAreasDto);
        return condominiumAreasMapper
                .condominiumAreasToCondominiumAreasView(condominiumAreasRepository.save(condominiumAreas));
    }

    public CondominiumAreasView update(Long id, CondominiumAreasDto condominiumAreasDto) {
        CondominiumAreas condominiumAreas = condominiumAreasRepository.findById(id)
                .orElseThrow(IdNotFoundException::new);
        condominiumAreasMapper.updateCondominiumAreasFromCondominiumAreasDto(condominiumAreasDto, condominiumAreas);
        return condominiumAreasMapper
                .condominiumAreasToCondominiumAreasView(condominiumAreasRepository.save(condominiumAreas));
    }

    @Transactional(readOnly = true)
    public Page<CondominiumAreasView> getAllCondominiumAreas(Pageable pageable) {
        return condominiumAreasRepository
                .findAll(pageable)
                .map(found -> condominiumAreasMapper.condominiumAreasToCondominiumAreasView(found));
    }

    @Transactional(readOnly = true)
    public CondominiumAreasView getById(Long id) {
        CondominiumAreas condominiumAreas = condominiumAreasRepository.findById(id)
                .orElseThrow(IdNotFoundException::new);
        return condominiumAreasMapper
                .condominiumAreasToCondominiumAreasView(condominiumAreas);
    }
}
