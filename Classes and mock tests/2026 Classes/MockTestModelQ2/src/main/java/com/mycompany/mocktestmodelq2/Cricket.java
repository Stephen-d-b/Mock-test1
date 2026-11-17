/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mocktestmodelq2;

/**
 *
 * @author Stephen D
 */
public abstract class Cricket {
    // Variables to store the data
    private String batsmanName;
    private String stadiumName;
    private int totalRunsScored;

    // Constructor that accepts parameters
    public Cricket(String batsmanName, String stadiumName, int totalRunsScored) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRunsScored = totalRunsScored;
    }

    // Methods to get the values (Getters)
    public String getBatsman() {
        return batsmanName;
    }

    public String getStadium() {
        return stadiumName;
    }

    public int getRunsScored() {
        return totalRunsScored;
    }
}
