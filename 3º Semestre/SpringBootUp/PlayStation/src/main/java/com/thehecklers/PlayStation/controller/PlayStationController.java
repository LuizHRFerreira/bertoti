package com.thehecklers.PlayStation.controller;

import com.thehecklers.PlayStation.model.PlayStation;
import com.thehecklers.PlayStation.service.PlayStationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/PlayStations")
@CrossOrigin(origins = "*")
public class PlayStationController {

    //Injeção de dependencia
    private final PlayStationService service;

    public PlayStationController(PlayStationService service) {
        this.service = service;
    }

    @GetMapping
    public List<PlayStation> getAllPlayStations() {
        return service.getAllPlayStations();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlayStation> getPlayStationById(@PathVariable Long id) {
        Optional<PlayStation> playstation = service.getPlayStationById(id);
        return playstation.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public PlayStation addPlayStation(@RequestBody PlayStation playstation) {
        return PlayStationService.addPlayStation(playstation);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlayStation> updatePlayStation(@PathVariable Long id, @RequestBody PlayStation playstation) {
        return service.updatePlayStation(id, playstation);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayStation(@PathVariable Long id) {
        service.deletePlayStation(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PlayStation> editPlayStation(@PathVariable Long id, @RequestBody PlayStation newData) {
        return service.editPlayStation(id, newData);
    }
}
