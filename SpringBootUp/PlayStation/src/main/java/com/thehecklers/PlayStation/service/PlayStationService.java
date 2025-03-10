package com.thehecklers.PlayStation.service;

import com.thehecklers.PlayStation.model.PlayStation;
import com.thehecklers.PlayStation.repository.PlayStationRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PlayStationService {

    private static PlayStationRepository playStationRepository = null;

    private final List<PlayStation> playstations = new ArrayList<>();

    public PlayStationService(PlayStationRepository playStationRepository) {
        PlayStationService.playStationRepository = playStationRepository;
        playstations.addAll(List.of(
                new PlayStation("Play Station 1", new BigDecimal("1299.00")),
                new PlayStation("Play Station 2", new BigDecimal("749.00")),
                new PlayStation("Play Station 3", new BigDecimal("1599.00")),
                new PlayStation("Play Station 4", new BigDecimal("2499.00")),
                new PlayStation("Play Station 5", new BigDecimal("3300.00"))
        ));
    }

    //Listar
    public List<PlayStation> getAllPlayStations() {
        return playStationRepository.findAll();
    }

    //Filtrar
    public Optional<PlayStation> getPlayStationById(Long id) {
        return playstations.stream().filter(p -> p.getId().equals(id)).findFirst();
    }

    //Criar
    public static PlayStation addPlayStation(PlayStation playstation) {
        return playStationRepository.save(playstation);
    }

    //Update Lista
    public ResponseEntity<PlayStation> updatePlayStation(Long id, PlayStation playstation) {
        for (int i = 0; i < playstations.size(); i++) {
            if (playstations.get(i).getId().equals(id)) {
                playstations.set(i, playstation);
                return ResponseEntity.ok(playstation);
            }
        }
        return ResponseEntity.notFound().build();
    }

    //Deletar
    public void deletePlayStation(Long id) {
        playStationRepository.deleteById(id);
    }

    //Edit
    public ResponseEntity<PlayStation> editPlayStation(Long id, PlayStation newData) {
        for (PlayStation c : playstations) {
            if (c.getId().equals(id)) {
                if (newData.getName() != null && !newData.getName().isEmpty()) {
                    c.setName(newData.getName());
                }
                if (newData.getPreco() != null) {
                    c.setPreco(newData.getPreco());
                }
                return ResponseEntity.ok(c);
            }
        }
        return ResponseEntity.notFound().build();
    }

}
