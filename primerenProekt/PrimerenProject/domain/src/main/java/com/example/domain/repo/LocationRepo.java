package com.example.domain.repo;

import com.example.domain.entities.Location;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LocationRepo extends JpaRepository<Location, Long> {

    Optional<Location> findLocationByName (String name);

}
