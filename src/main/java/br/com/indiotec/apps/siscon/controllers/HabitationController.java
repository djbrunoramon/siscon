package br.com.indiotec.apps.siscon.controllers;

import br.com.indiotec.apps.siscon.dtos.HabitationDto;
import br.com.indiotec.apps.siscon.dtos.views.HabitationView;
import br.com.indiotec.apps.siscon.services.HabitationService;
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
@RequestMapping("/api/v1/habitation")
public class HabitationController {

    @Autowired
    private HabitationService habitationService;

    @GetMapping
    public ResponseEntity<List<HabitationView>> getAllHabitations(Pageable pageable) {
        Page<HabitationView> habitationViews = habitationService.findAll(pageable);
        return ResponseEntity.ok(habitationViews.getContent());
    }

    @PostMapping
    public ResponseEntity<HabitationView> saveHabitation(@RequestBody HabitationDto habitationDto) {
        HabitationView habitationSaved = habitationService.save(habitationDto);
        return new ResponseEntity<>(habitationSaved, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HabitationView> updateHabitation(@PathVariable Long id,
                                                           @Valid @RequestBody HabitationDto habitationDto) {
        HabitationView habitationSaved = habitationService.update(id, habitationDto);
        return new ResponseEntity<>(habitationSaved, HttpStatus.OK);
    }
}
