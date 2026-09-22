/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mock2024q2;

/**
 *
 * @author NLS - SMP
 */
public abstract class RoadAccidents implements IRoadAccidents {
    // Variables
    private String vehicleType;
    private String city;
    private int numberOfAccidents;

    // Constructor
    public RoadAccidents(String vehicleType, String city, int numberOfAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.numberOfAccidents = numberOfAccidents;
    }

    // Getters (from the interface)
    @Override
    public String getAccidentVehicleType() { return vehicleType; }
    @Override
    public String getCity() { return city; }
    @Override
    public int getAccidentTotal() { return numberOfAccidents; }
}
