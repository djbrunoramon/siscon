package br.com.indiotec.apps.siscon.controllers;

import br.com.indiotec.apps.siscon.dtos.ResidentHabitationDto;
import br.com.indiotec.apps.siscon.dtos.views.ResidentHabitationView;
import br.com.indiotec.apps.siscon.model.ResidentHabitation;
import br.com.indiotec.apps.siscon.services.ResidentHabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/resident-habitation")
public class ResidentHabitationController {

    @Autowired
    private ResidentHabitationService residentHabitationService;

    @GetMapping
    public ResponseEntity<List<ResidentHabitationView>> getAllResidentHabitation(Pageable pageable) {
        Page<ResidentHabitationView> residentHabitationViews = residentHabitationService.findAll(pageable);
        return ResponseEntity.ok(residentHabitationViews.getContent());
    }

    @PostMapping
    public ResponseEntity<ResidentHabitationView> saveResidentHabitation(@RequestBody ResidentHabitationDto residentHabitationDto) {
        ResidentHabitationView residentHabitationView = residentHabitationService.save(residentHabitationDto);
        return new ResponseEntity<>(residentHabitationView, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ResidentHabitationView> updateResidentHabitation(@PathVariable Long id,
                                                                          @Valid @RequestBody ResidentHabitationDto residentHabitationDto) {
        ResidentHabitationView residentHabitationView = residentHabitationService.update(id, residentHabitationDto);
        return new ResponseEntity<>(residentHabitationView, HttpStatus.CREATED);
    }
}
