/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exq2;

/**
 *
 * @author NLS - SMP
 */

// Q.2.7 - The logic class that implements the interface.
// This is where the calculations and validation rules happen.
public class EstateAgent implements IEstateAgent {

    // Q.2.4 - Calculates the commission based on the property price and percentage.
    @Override
    public double CalculateCommission(String propertyPrice, String agentCommission) {
        // The interface requires Strings, so we must convert them to doubles to do math.
        double price = Double.parseDouble(propertyPrice);
        double commPct = Double.parseDouble(agentCommission);
        
        // Formula: Price * (Percentage / 100). E.g., 800000 * (10 / 100) = 80000
        return price * (commPct / 100); 
    }

    // Q.2.7 - Validates the captured data against the exam's specific rules.
    @Override
    public boolean ValidateData(Data dataToValidate) {
        // Rule 1: Location cannot be empty. (.trim() removes extra spaces before checking)
        if (dataToValidate.agentLocation == null || dataToValidate.agentLocation.trim().isEmpty()) {
            return false; 
        }
        
        // Rule 2: Agent Name cannot be empty.
        if (dataToValidate.agentName == null || dataToValidate.agentName.trim().isEmpty()) {
            return false;
        }
        
        // Rule 3: Property price cannot be <= 0.
        if (dataToValidate.propertyPrice <= 0) {
            return false;
        }
        
        // Rule 4: Commission percentage cannot be <= 0.
        if (dataToValidate.commissionPercentage <= 0) {
            return false;
        }
        
        // If all checks pass without returning false, the data is valid.
        return true; 
    }
}

