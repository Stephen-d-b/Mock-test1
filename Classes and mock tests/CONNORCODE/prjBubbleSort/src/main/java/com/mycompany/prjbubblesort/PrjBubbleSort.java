/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjbubblesort;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjBubbleSort {

    public static void main(String[] args) {
        final int intSIZE = 10;
        int[] intNum = new int[intSIZE];
        int iIndex1 = 0;
        int iIndex2 = 0;
        int intTemp = 0;
        String strDisplay = "";
        int iTotal = 0;

        while (iIndex1 < intSIZE - 1) {
            intNum[iIndex1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number"));
            iIndex1++;
        }

        while (iIndex1 < intSIZE - 1) {
            while (iIndex2 < intSIZE - 1) {
                if (intNum[iIndex2] < intNum[iIndex2 + 1]) {
                    intTemp = intNum[iIndex2];
                    intNum[iIndex2] = intNum[iIndex2 + 1];
                    intNum[iIndex2 + 1] = intTemp;
                }
                iIndex2++;
            }
            iIndex1++;
        }

        String strMessage = "";
        for (int iIndex = 0; iIndex < intNum.length; iIndex++) {
            strMessage = "\n" + iIndex + 1 + ". " + intNum[iIndex];
            iTotal += intNum[iIndex];
        }
    }
}
