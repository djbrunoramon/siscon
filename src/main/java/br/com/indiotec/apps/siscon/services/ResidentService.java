package br.com.indiotec.apps.siscon.services;

import br.com.indiotec.apps.siscon.dtos.ResidentDto;
import br.com.indiotec.apps.siscon.dtos.mapper.ResidentMapper;
import br.com.indiotec.apps.siscon.dtos.views.ResidentView;
import br.com.indiotec.apps.siscon.exception.IdNotFoundException;
import br.com.indiotec.apps.siscon.model.Resident;
import br.com.indiotec.apps.siscon.repository.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ResidentService {

    @Autowired
    private ResidentRepository residentRepository;

    @Autowired
    private ResidentMapper residentMapper;

    public ResidentView save(ResidentDto residentDto) {
        Resident resident = residentMapper.residentDtoToResident(residentDto);
        return residentMapper.residentToResidentView(residentRepository.save(resident));
    }

    @Transactional(readOnly = true)
    public Page<ResidentView> findAll(Pageable pageable) {
        return residentRepository.findAll(pageable)
                .map(found -> residentMapper.residentToResidentView(found));
    }

    public ResidentView update(Long id, ResidentDto residentDto) {
        Resident resident = residentRepository.findById(id)
                .orElseThrow(IdNotFoundException::new);
        residentMapper.updateResidentFromResidentDto(residentDto, resident);
        return residentMapper.residentToResidentView(residentRepository.save(resident));
    }
}
