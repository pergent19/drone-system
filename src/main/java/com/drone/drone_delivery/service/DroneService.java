package com.drone.drone_delivery.service;

import com.drone.drone_delivery.model.Drone;
import com.drone.drone_delivery.repository.DroneRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DroneService {

    private final DroneRepository droneRepository;

    public DroneService(DroneRepository droneRepository) {
        this.droneRepository = droneRepository;
    }

    // Get all drones
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    // Get drone by ID
    public Optional<Drone> getDroneById(Long id) {
        return droneRepository.findById(id);
    }

    // Create or update a drone
    public Drone saveDrone(Drone drone) {
        return droneRepository.save(drone);
    }

    // Delete a drone
    public void deleteDrone(Long id) {
        droneRepository.deleteById(id);
    }
}
