/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjInsertionSort {

    public static void main(String[] args) {
        final int intSIZE = 10;
        int[] intNum = new int[intSIZE];
        int iIndex1 = 0;
        int intTemp = 0;
        int iTotal = 0;

        while (iIndex1 < intSIZE) {
            intNum[iIndex1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number"));
            iIndex1++;
        }

        for (int i = 1; i < intNum.length; i++) {
            int j = i;
            while (j > 0 && intNum[j - 1] > intNum[j]) {
                intTemp = intNum[j];
                intNum[j] = intNum[j - 1];
                intNum[j - 1] = intTemp;

                j = j - 1;
            }
        }

        String strMessage = "Here is your ordered list:\n";

        for (int iIndex = 0; iIndex < intNum.length; iIndex++) {
            strMessage += "\n" + (iIndex + 1) + ". " + intNum[iIndex];
            iTotal += intNum[iIndex];
        }

        strMessage += "\n\nTotal Sum: " + iTotal;

        JOptionPane.showMessageDialog(null, strMessage);
    }
}
