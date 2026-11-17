/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjbubblesort;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjBubbleSort {

    public static void main(String[] args) {
        final int intSize = 0;
        int[] intNum = new int[intSize];
        int index1 = 0;
        int index2 = 0;
        int intTemp = 0;
        String strDisplay = "";
        
        //get the number from the user
        while(index1 < intSize)
        {
            intNum[index1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number for position " + index1));
            index1++;
        }
    }
}
