package com.drone.drone_delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drone.drone_delivery.model.Medication;
import com.drone.drone_delivery.service.MedicationService;

@RestController
@RequestMapping("/api/medications")
public class MedicationController {

    @Autowired
    private MedicationService medicationService;

    @PostMapping("/add")
    public ResponseEntity<Medication> addMedication(@RequestBody Medication medication) {
        System.out.println(medication.toString());
        Medication savedMedication = medicationService.addMedication(medication);
        return ResponseEntity.ok(savedMedication);
    }

    @GetMapping
    public ResponseEntity<List<Medication>> getAllMedications() {
        List<Medication> medications = medicationService.getAllMedications();
        return ResponseEntity.ok(medications);
    }


}
