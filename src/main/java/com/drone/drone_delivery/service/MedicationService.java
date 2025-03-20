package com.drone.drone_delivery.service;

import com.drone.drone_delivery.model.Medication;
import com.drone.drone_delivery.repository.MedicationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicationService {

    @Autowired
    private MedicationRepository medicationRepository;

    public Medication addMedication(Medication medication) {
        return medicationRepository.save(medication);
    }

    public Medication getMedicationByCode(String code) {
        return medicationRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Medication not found"));
    }

    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    public void deleteMedication(Long id) {
        medicationRepository.deleteById(id);
    }
}