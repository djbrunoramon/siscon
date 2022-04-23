package br.com.indiotec.apps.siscon.controllers;

import br.com.indiotec.apps.siscon.dtos.ResidentDto;
import br.com.indiotec.apps.siscon.dtos.views.ResidentView;
import br.com.indiotec.apps.siscon.services.ResidentService;
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
@RequestMapping("/api/v1/resident")
public class ResidentController {

    @Autowired
    private ResidentService residentService;

    @GetMapping
    public ResponseEntity<List<ResidentView>> getAllResidents(Pageable pageable) {
        Page<ResidentView> residentViews = residentService.findAll(pageable);
        return ResponseEntity.ok(residentViews.getContent());
    }

    @PostMapping
    public ResponseEntity<ResidentView> saveResident(@RequestBody ResidentDto residentDto) {
        ResidentView residentView = residentService.save(residentDto);
        return new ResponseEntity<>(residentView, HttpStatus.CREATED);
    }
}
