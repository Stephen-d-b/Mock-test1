/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mock2024q2;

/**
 *
 * @author NLS - SMP
 */
public class RoadAccidentReport extends RoadAccidents {

    // Constructor
    public RoadAccidentReport(String vehicleType, String city, int numberOfAccidents) {
        super(vehicleType, city, numberOfAccidents);
    }

    // Print method
    public void printAccidentReport() {
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("***************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("***************************");
    }
}
