/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mocktestmodelq2;

/**
 *
 * @author Stephen D
 */
public class CricketRunsScored extends Cricket implements ICricket {

    // Constructor that passes the parameters up to the abstract class
    public CricketRunsScored(String batsmanName, String stadiumName, int totalRunsScored) {
        super(batsmanName, stadiumName, totalRunsScored);
    }

    // Method to print the report exactly as shown in the screenshot
    public void printReport() {
        System.out.println("BATSMAN RUNS SCORED REPORT");
        System.out.println("**************************");
        System.out.println("CRICKET PLAYER: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getRunsScored());
    }
}
