package com.drone.drone_delivery.controller;

import com.drone.drone_delivery.model.Drone;
import com.drone.drone_delivery.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/drones")
public class DroneController {

    @Autowired
    private DroneRepository droneRepository;

    @PostMapping
    public ResponseEntity<Drone> createDrone(@RequestBody Drone drone) {
        Drone savedDrone = droneRepository.save(drone);
        return ResponseEntity.ok(savedDrone);
    }

    @GetMapping
    public List<Drone> getAllDrones() {
        return droneRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Drone> getDroneById(@PathVariable Long id) {
        Optional<Drone> drone = droneRepository.findById(id);
        return drone.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
