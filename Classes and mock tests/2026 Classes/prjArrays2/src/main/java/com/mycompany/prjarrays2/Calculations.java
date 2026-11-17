/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjarrays2;

/**
 *
 * @author Stephen D
 */
public class Calculations {
    
    private double[] arrNumbers;
    
    public Calculations(double[] arrNumbers)
    {
        this.arrNumbers = arrNumbers;
    }
    
    public double calculateTotal()
    {
        double dblTotal = 0;
        
        for (int index = 0; index < arrNumbers.length; index++)
        {
            dblTotal += arrNumbers[index];
        }
        
        return dblTotal;
    }
    
    public double calculateAverage()
    {
        return calculateTotal() / arrNumbers.length;
    }
    
    public int getCount()
    {
        return arrNumbers.length;
    }    
    
    public double findHighest()
    {
        double dblHigh = arrNumbers[0];
        
        for (int index = 0; index < arrNumbers.length; index++)
        {
            if (arrNumbers[index] > dblHigh)
            {
                dblHigh = arrNumbers[index];
            }//endif
        }//endFor
        
        return dblHigh;
    }
    
}
