/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exq2;

/**
 *
 * @author NLS - SMP
 */
public class Question2 {

    public static void main(String[] args) {
        // Q.2.1 - Create a single-dimensional (1D) array to store the province names.
        // We need this so we can print the province name next to its property prices.
        String[] provinces = {"Gauteng", "Natal", "Cape"};
        
        // Q.2.1 - Create a two-dimensional (2D) array to store the property prices.
        // Think of this like a spreadsheet:
        // Rows = Provinces (Row 0 = Gauteng, Row 1 = Natal, Row 2 = Cape)
        // Columns = Property Types (Col 0 = Flat, Col 1 = Townhouse, Col 2 = House)
        double[][] propertyPrices = {
            {800000.0, 1500000.0, 2000000.0}, // Gauteng's prices
            {700000.0, 1200000.0, 1600000.0}, // Natal's prices
            {750000.0, 1300000.0, 1800000.0}  // Cape's prices
        };

        // Print the report header. 
        // %-15s means "left-align this string and give it 15 spaces of room".
        // %15s means "right-align this string and give it 15 spaces of room".
        System.out.printf("%-15s %3s %28s %17s\n", "", "FLAT", "TOWN HOUSE", "HOUSE");
        
        // Print a dashed line to separate the header from the data
        System.out.println("-------------------------------------------------------------------------");

        // Q.2.2 - Loop through the 2D array to print prices and calculate averages.
        // We loop from 0 to 2 (length of the provinces array).
        for (int i = 0; i < provinces.length; i++) {
            
            // Format the numbers with commas and zero decimals
            String flatStr = String.format("%.0f", propertyPrices[i][0]);     //Remove the ',' from "%.0f" to make the spacing look correct
            String townStr = String.format("%.0f", propertyPrices[i][1]);
            String houseStr = String.format("%.0f", propertyPrices[i][2]);
            
            // Print the row for this province (spaced nicely)
            System.out.printf("%-16s R %-20s R %-19s R %-20s\n", 
                    provinces[i], flatStr, townStr, houseStr);
        }

        // Print a blank line to separate the table from the averages
        System.out.println(); 

        // --- LOOP 2: Calculate and print the averages together ---
        for (int i = 0; i < provinces.length; i++) {
            // Add the three property prices together for the current province
            double total = propertyPrices[i][0] + propertyPrices[i][1] + propertyPrices[i][2];
            
            // Divide the total by 3 to get the average
            double average = total / 3;
            
            // Format the average
            String avgStr = String.format("%,.0f", average);
            
            // Print the average
            System.out.printf("Average property prices in %s = R %s\n", provinces[i], avgStr);
        }
    }
}
