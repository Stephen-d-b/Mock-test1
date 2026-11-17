/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjbubblesort2;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjBubbleSort2 {

    public static void main(String[] args) {
        
        // improved bubble sort
        
        
        int[] intNumbers = {900, 300, 700};
        int intTemp;
        String strDisplay = "Numbers BEFORE the bubble sort: \n\n";
        
        displayNumbers(intNumbers, strDisplay);
        
        for (int pass = 0; pass < intNumbers.length - 1; pass++) 
        {
           //innerloop
            for (int index = 0; index < intNumbers.length - 1 - pass; index++) 
            {
                // sort array in descending order
                if (intNumbers[index] < intNumbers[index + 1])
                {
                    intTemp = intNumbers[index];
                    intNumbers[index] = intNumbers[index + 1];
                    intNumbers[index + 1] = intTemp;
                }//endif
            }//endfor
        }//endfor
        
        strDisplay = "NUMBERS AFTER THE BUBBLE SORT \n\n";
        
        displayNumbers(intNumbers, strDisplay);
        
    }

    private static void displayNumbers(int[] intNumbers, String strDisplay)
    {
        
        String sort = "";
        
        for (int i = 0; i < intNumbers.length; i++) 
        {
            sort += intNumbers[i] + "\t  ";
        }
            
        JOptionPane.showMessageDialog(null, strDisplay + sort);
        
    }
    
}
