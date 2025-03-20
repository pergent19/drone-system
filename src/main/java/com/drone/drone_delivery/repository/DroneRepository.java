package com.drone.drone_delivery.repository;

import com.drone.drone_delivery.model.Drone;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DroneRepository extends JpaRepository<Drone, Long> {
    Optional<Drone> findBySerialNumber(String serialNumber);
    
}
