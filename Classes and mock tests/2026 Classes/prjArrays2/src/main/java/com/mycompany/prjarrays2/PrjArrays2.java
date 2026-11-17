/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays2;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjArrays2 {

    public static void main(String[] args) {
        
        int intNumberAmt = Integer.parseInt(JOptionPane.showInputDialog(null, "how many numbers would you like to enter"));
        
        double[] arrNumbers = new double[intNumberAmt];
        
        for (int index = 0; index < intNumberAmt; index++)
        {
            arrNumbers[index] = Double.parseDouble(JOptionPane.showInputDialog(null, "please enter a Number " + (index + 1)));
            
        }   
        
        Calculations calc = new Calculations(arrNumbers);
        
        displayResults(calc);
    }
    
    public static void displayResults(Calculations calc)
    {
        JOptionPane.showMessageDialog(null, "TOTAL: " + Math.round(calc.calculateTotal()) + "\n" +
                                        "AVERAGE: " + Math.round(calc.calculateAverage()) + "\n" + 
                                        "COUNT: " + Math.round(calc.getCount()) + "\n" +
                                        "HIGHEST NUMBER:" + Math.round(calc.findHighest()));
    }
    
}
