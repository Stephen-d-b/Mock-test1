/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjbubblesort3;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjBubbleSort3 {

    public static void main(String[] args) {
        int intNumbers[] = new int[1000000];
        
        for (int iIndex = 0; iIndex < 1000000; iIndex++) {
            intNumbers[iIndex] = (int)(Math.random() * 10000001);
        }
        
        int intTemp;

        String strDisplay = "Number BEFORE the bubble sort: \n";

        displayNumbers(intNumbers, strDisplay);

        for (int pass = 0; pass < intNumbers.length - 1; pass++) {
            for (int iIndex = 0; iIndex < intNumbers.length - 1 - pass; iIndex++) {
                if (intNumbers[iIndex] < intNumbers[iIndex + 1]) {
                    intTemp = intNumbers[iIndex];
                    intNumbers[iIndex] = intNumbers[iIndex + 1];
                    intNumbers[iIndex + 1] = intTemp;
                }
            }
        }
        
        strDisplay = "Numbers AFTER dah bubble sort: \n";
        
        displayNumbers(intNumbers, strDisplay);
    }
    
    public static void displayNumbers(int[] intNumbers, String strDisplay) {
        for (int intNumber : intNumbers) {
            strDisplay += intNumber + "\n";
        }
        System.out.println(strDisplay);
    }
}
