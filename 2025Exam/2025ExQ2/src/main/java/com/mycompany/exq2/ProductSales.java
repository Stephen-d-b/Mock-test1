/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exq2;

/**
 *
 * @author NLS - SMP
 */



/*
 * Class ProductSales
 * This class implements the iProductSales interface.
 * It contains the 2D array data and the logic to calculate the totals, limits, and averages.
 */
public class ProductSales implements iProductSales {

    // 1. The data from the exam table (2 Years x 3 Products)
    // Rows = Years, Columns = [0]Microphone, [1]Speakers, [2]Mixing Desk
    private int[][] salesData = {
        {300, 150, 700}, // Year 1
        {250, 200, 600}  // Year 2
    };
    
    // The sales limit mentioned in the question
    private final int LIMIT = 500;

    @Override
    public int[][] GetProductSales() {
        return salesData;
    }

    @Override
    public int GetTotalSales() {
        int total = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                total = total + salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public int GetSalesOverLimit() {
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                // If the sale is strictly GREATER than 500
                if (salesData[i][j] > LIMIT) { 
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetSalesUnderLimit() {
        int count = 0;
        for (int i = 0; i < salesData.length; i++) {
            for (int j = 0; j < salesData[i].length; j++) {
                // If the sale is 500 OR LESS
                if (salesData[i][j] <= LIMIT) { 
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public int GetProductsProcessed() {
        // The number of years processed is exactly the number of rows in the 2D array
        return salesData.length;
    }

    @Override
    public double GetAverageSales() {
        int total = GetTotalSales();
        
        // Total number of items = rows * columns (2 * 3 = 6)
        int numberOfItems = salesData.length * salesData[0].length;
        
        // Convert to double without using casting (as requested)
        double totalAsDouble = Double.parseDouble("" + total);
        
        // Calculate and return average
        return totalAsDouble / numberOfItems;
    }
}
