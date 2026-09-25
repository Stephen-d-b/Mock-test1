/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjbubblesort2;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjBubbleSort2 {

    public static void main(String[] args) {
        final int SIZE = 5;
        String[] strName = new String[SIZE];

        for (int index = 0; index < SIZE; index++) {
            strName[index] = JOptionPane.showInputDialog("Enter name number " + (index + 1) + ": ");

        }
        bubbleSort(strName, SIZE);
        displayName(strName);
    }

    public static void bubbleSort(String[] strName, int SIZE) {
        for (int pass = 0; pass < SIZE - 1; pass++) {
            for (int index = 0; index < SIZE - 1; index++) {
                if (strName[index].compareToIgnoreCase(strName[index + 1]) > 0) {
                    String strTemp = strName[index];
                    strName[index] = strName[index + 1];
                    strName[index + 1] = strTemp;
                }
            }
        }
    }

    public static void displayName(String[] strName) {
        String strDisplay = " Sorted names: \n";
        for (String strNames : strName) {
            strDisplay += strNames + "\n";

        }
        JOptionPane.showMessageDialog(null, strDisplay);
    }
}

