/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinsertionsort1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjInsertionSort1 {

    public static void main(String[] args) {
        int[] intNums = {500, 300, 700, 200, 900};
        
        String strMessage = "Numbers before sorting: \n\n";
        
        displayNumbers(intNums, strMessages);
        
        String strOption = JOptionPane.showInputDialog(null, "Choose a sorting method: \n\n" +
                                                              "1. bubble sort Acending \n\n" +
                                                              "2. bubble sort decending \n\n" +
                                                              "3. insertion sort");
        switch (strOption)
        {
            case "1":
                bubbleSort(intNums, "Numbers AFTER bubble sort Asending: \n\n", "1");
                break;
                
            case "2":
                bubbleSort(intNums, "Numbers AFTER bubble sort desending: \n\n", "2");
                break;
            
            case "3":
                bubbleSort(intNums, "Numbers AFTER insertion sort: \n\n", "3);
                break;
                
            default:
                JOptionPane.showMessageDialog(null, "invalid menu option");
        }
    }
}


