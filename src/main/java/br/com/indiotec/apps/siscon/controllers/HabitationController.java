package br.com.indiotec.apps.siscon.controllers;

import br.com.indiotec.apps.siscon.dtos.HabitationDto;
import br.com.indiotec.apps.siscon.services.HabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/habitation")
public class HabitationController {

    @Autowired
    private HabitationService habitationService;

    @GetMapping
    public ResponseEntity<List<HabitationDto>> getAllHabitations(Pageable pageable) {
        Page<HabitationDto> habitationDtoPage = habitationService.findAll(pageable);
        return ResponseEntity.ok(habitationDtoPage.getContent());
    }

    @PostMapping
    public ResponseEntity<HabitationDto> saveHabitation(@RequestBody HabitationDto habitationDto) {
        HabitationDto habitationSaved = habitationService.save(habitationDto);
        return new ResponseEntity<>(habitationSaved, HttpStatus.CREATED);
    }
}
