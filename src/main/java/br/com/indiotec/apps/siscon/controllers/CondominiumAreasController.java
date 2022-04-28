package br.com.indiotec.apps.siscon.controllers;

import br.com.indiotec.apps.siscon.dtos.CondominiumAreasDto;
import br.com.indiotec.apps.siscon.dtos.views.CondominiumAreasView;
import br.com.indiotec.apps.siscon.services.CondominiumAreasService;
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
@RequestMapping("/api/v1/condominium-areas")
public class CondominiumAreasController {


    @Autowired
    private CondominiumAreasService condominiumAreasService;

    @PostMapping
    public ResponseEntity<CondominiumAreasView> saveCondominiumAreas(@Valid @RequestBody CondominiumAreasDto condominiumAreasDto) {
        CondominiumAreasView condominiumAreasView = condominiumAreasService.save(condominiumAreasDto);
        return new ResponseEntity<>(condominiumAreasView, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<CondominiumAreasView> updateCondominiumAreas(@PathVariable Long id,
                                                                       @Valid @RequestBody CondominiumAreasDto condominiumAreasDto) {
        CondominiumAreasView condominiumAreasView = condominiumAreasService.update(id, condominiumAreasDto);
        return new ResponseEntity<>(condominiumAreasView, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CondominiumAreasView>> getAllCondominiumAreas(Pageable pageable) {
        Page<CondominiumAreasView> condominiumAreasViews = condominiumAreasService.getAllCondominiumAreas(pageable);
        return ResponseEntity.ok(condominiumAreasViews.getContent());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CondominiumAreasView> getByIdCondominiumAreas(@PathVariable Long id) {
        CondominiumAreasView condominiumAreasView = condominiumAreasService.getById(id);
        return ResponseEntity.ok(condominiumAreasView);
    }
}
