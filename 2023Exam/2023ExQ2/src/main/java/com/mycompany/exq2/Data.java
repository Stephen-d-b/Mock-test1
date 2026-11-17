/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exq2;

/**
 *
 * @author NLS - SMP
 */


// Q.2.7 - A helper class to hold the data captured from the GUI
// so it can be passed to the ValidateData method.
public class Data {
    public String agentLocation;
    public String agentName;
    public double propertyPrice;
    public double commissionPercentage;

    public Data(String agentLocation, String agentName, double propertyPrice, double commissionPercentage) {
        this.agentLocation = agentLocation;
        this.agentName = agentName;
        this.propertyPrice = propertyPrice;
        this.commissionPercentage = commissionPercentage;
    }
}
