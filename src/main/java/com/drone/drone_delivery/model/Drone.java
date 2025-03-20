package com.drone.drone_delivery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Drone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "serial_number", nullable = false)
    private String serialNumber;
    
    @Column(name = "model", nullable = false)
    private String model;
    
    @Column(name = "weight_capacity", nullable = false)
    private Double weightCapacity;
    
    @Column(name = "battery_capacity", nullable = false)
    private Double batteryCapacity;
    
    @Column(name = "state", nullable = false)
    private String state;

    public Drone() {
    }

    public Drone(String serialNumber, String model, Double weightCapacity, Double batteryCapacity, String state) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weightCapacity = weightCapacity;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getWeightCapacity() {
        return weightCapacity;
    }

    public void setWeightCapacity(Double weightCapacity) {
        if (weightCapacity <= 0) {
            throw new IllegalArgumentException("Weight capacity must be positive");
        }
        this.weightCapacity = weightCapacity;
    }

    public Double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Double batteryCapacity) {
        if (batteryCapacity < 0 || batteryCapacity > 100) {
            throw new IllegalArgumentException("Battery capacity must be between 0 and 100");
        }
        this.batteryCapacity = batteryCapacity;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == null) {
            throw new IllegalArgumentException("State cannot be null");
        }
        this.state = state;
    }


    @Override
    public String toString() {
        return "Drone [id=" + id + ", serialNumber=" + serialNumber + ", model=" + model + ", weightCapacity="
                + weightCapacity + "g, batteryCapacity=" + batteryCapacity + "%, state=" + state + "]";
    }

}
