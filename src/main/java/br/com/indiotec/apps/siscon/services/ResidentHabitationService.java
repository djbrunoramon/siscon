package br.com.indiotec.apps.siscon.services;

import br.com.indiotec.apps.siscon.dtos.ResidentHabitationDto;
import br.com.indiotec.apps.siscon.dtos.mapper.ResidentHabitationMapper;
import br.com.indiotec.apps.siscon.dtos.views.ResidentHabitationView;
import br.com.indiotec.apps.siscon.model.ResidentHabitation;
import br.com.indiotec.apps.siscon.repository.ResidentHabitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ResidentHabitationService {

    @Autowired
    private ResidentHabitationRepository residentHabitationRepository;

    @Autowired
    private ResidentHabitationMapper residentHabitationMapper;

    public ResidentHabitationView save(ResidentHabitationDto residentHabitationDto) {
        ResidentHabitation residentHabitation = residentHabitationMapper.residentHabitationDtoToResidentHabitation(residentHabitationDto);
        return residentHabitationMapper
                .ResidentHabitationToResidentHabitationView(residentHabitationRepository.save(residentHabitation));
    }

    @Transactional(readOnly = true)
    public Page<ResidentHabitationView> findAll(Pageable pageable) {
        return residentHabitationRepository.findAll(pageable)
                .map(found -> residentHabitationMapper.ResidentHabitationToResidentHabitationView(found));
    }

    @Transactional(readOnly = true)
    public ResidentHabitationView findById(Long id) {
        return residentHabitationRepository.findById(id)
                .map(found -> residentHabitationMapper.ResidentHabitationToResidentHabitationView(found))
                .orElseThrow(() -> new IllegalArgumentException("Id not found"));
    }
}
