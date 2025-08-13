package com.thehecklers.PlayStation.repository;

import com.thehecklers.PlayStation.model.PlayStation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PlayStationRepository extends JpaRepository<PlayStation, Long> {
}
