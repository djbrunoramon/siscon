package br.com.indiotec.apps.siscon.services;

import br.com.indiotec.apps.siscon.dtos.HabitationDto;
import br.com.indiotec.apps.siscon.dtos.mapper.HabitationMapper;
import br.com.indiotec.apps.siscon.dtos.views.HabitationView;
import br.com.indiotec.apps.siscon.model.Habitation;
import br.com.indiotec.apps.siscon.repository.HabitationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class HabitationService {

    @Autowired
    private HabitationRepository habitationRepository;

    @Autowired
    protected HabitationMapper habitationMapper;

    public HabitationView save(HabitationDto habitationDto) {
        Habitation habitation = habitationMapper.habitationDtoToHabitation(habitationDto);
        return habitationMapper.habitationToHabitationView(habitationRepository.save(habitation));
    }

    @Transactional(readOnly = true)
    public Page<HabitationView> findAll(Pageable pageable) {
        return habitationRepository.findAll(pageable)
                .map(found -> habitationMapper.habitationToHabitationView(found));
    }
}
