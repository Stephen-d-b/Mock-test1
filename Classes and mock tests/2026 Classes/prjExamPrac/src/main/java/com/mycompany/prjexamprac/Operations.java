/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjexamprac;

/**
 *
 * @author Stephen D
 */
public class Operations implements iOperations {
    
    @Override
    public int totalOperations(int[][] operations)
    {
        //stores the total number of operations
        int totalOperations = 0;
        
        // loop through each row in the 2d array
        for (int[] producSales : operations)
        {
            // loop through the three values in the current row
            for (int index = 0; index < 3; index++) 
            {
                // add the current value to the total
                totalOperations += prouctSales[index];
            }
        }
        
        // returns the total number of operations
        return totalOperations;
    }
    
    @Override
    public double averageOperations(int[][] operations)
    {
        // stores the average number of operations
        double averageOperations = 0.0;
        // note, if the "orange" message says assigned value is never used that is fine 
        // if the message says variable is not used, then it is a problem
        // need to be assigned a starting value as a double otherwise it will be seen as an object
        
        // stores the sum of all operations
        double totalOperations = 0;
        
        // counts the number of operations values
        double operationsCount = 0;
        
        // loops through each row in the 2D array
        for(int[] productSale : operations)
        {
            // loops through the three values in the current row
            for (int index = 0; index < 3; index++) 
            {
                // add the current value to the total
                totalOperations += productSale[index];
                
                //increases the count by one for eachvalue
                operationsCount += 1;
            }
        }
        
        //calculate the average by dividing the total by the count
        averageOperations = totalOperations / operationsCount;
        
        //returns the average number of operations
        return averageOperations;
    }
    
    @Override 
    public int maxOperations(int[][] operations)
    {
       //stores the total number of operations
        int maxOperations = operations[0][0];
        
        // loop through each row in the 2d array
        for (int index = 0; index < 2; index++)       
        {
            // loop through the three values in the current row
            for (int index1 = 0; index1 < 3; index1++) 
            {
                // add the current value to the total
                if(operations[index][index1] >= maxOperations)
                {
                    maxOperations = operations[index][index1];
                }
            }
        }
        
        // returns the total number of operations
        return maxOperations;
    } 
    
    @Override 
    public int minOperations(int[][] operations)
    {
       //stores the total number of operations
        int lowestSale = operations[0][0];
        
        // loop through each row in the 2d array
        for (int index = 0; index < 2; index++)       
        {
            // loop through the three values in the current row
            for (int index1 = 0; index1 < 3; index1++) 
            {
                // add the current value to the total
                if(operations[index][index1] >= lowestSale)
                {
                    lowestSale = operations[index][index1];
                }
            }
        }
        
        // returns the total number of operations
        return lowestSale;
    } 
    
}
