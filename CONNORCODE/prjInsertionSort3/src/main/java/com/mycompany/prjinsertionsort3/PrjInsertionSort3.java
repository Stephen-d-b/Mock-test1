/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjinsertionsort3;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjInsertionSort3 {

    public static void main(String[] args) {
        int[] arrNums = {67, 420, 21, 69, 30, 2020, 9, 10};

        String strMessage = "Numbers BEFORE Sorting: \n";

        displayNumbers(arrNums, strMessage, 0, 0);

        String strOption = JOptionPane.showInputDialog(null, "Choose a sorting method: \n\n"
                + "1. Bubble sort (Ascending order\n"
                + "2. Bubble sort (descending order)\n"
                + "3. Insertion sort");

        switch (strOption) {
            case "1":
                bubbleSort(arrNums, "Numbers AFTER bubble sort(Ascending): \n", "1");
                break;
            case "2":
                bubbleSort(arrNums, "Numbers AFTER bubble sort(Descending): \n", "2");
                break;
            case "3":
                insertionSort(arrNums, "Numbers AFTER insertion sort: \n");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid menu option");
        }
    }

    public static void bubbleSort(int[] arrNums, String strMessage, String strOption) {
        int intSteps = 0;
        int intPass = 0;
        int intTemp = 0;

        for (int pass = 0; pass < arrNums.length - 1; pass++) {
            intPass++;
            for (int iIndex = 0; iIndex < arrNums.length - 1 - pass; iIndex++) {
                intSteps++;
                if (arrNums[iIndex] > arrNums[iIndex + 1] && strOption.equalsIgnoreCase("1")) {
                    intTemp = arrNums[iIndex];
                    arrNums[iIndex] = arrNums[iIndex + 1];
                    arrNums[iIndex + 1] = intTemp;
                }

                if (arrNums[iIndex] < arrNums[iIndex + 1] && strOption.equalsIgnoreCase("2")) {
                    intTemp = arrNums[iIndex];
                    arrNums[iIndex] = arrNums[iIndex + 1];
                    arrNums[iIndex + 1] = intTemp;
                }
            }

        }
        displayNumbers(arrNums, strMessage, intSteps, intPass);
    }

    public static void insertionSort(int[] arrNums, String strMessage) {
        int intTemp = 0;
        int intPass = 0;
        int iIndex = 0;

        int intSteps = 0;
        int intPasses = 0;

        intPass = 1;

        while (intPass < arrNums.length) {
            intTemp = arrNums[intPass];
            iIndex = intPass - 1;
            intPasses++;

            while (iIndex >= 0 && arrNums[iIndex] > intTemp) {
                intSteps++;
                arrNums[iIndex + 1] = arrNums[iIndex];
                iIndex = iIndex - 1;
            }
            arrNums[iIndex + 1] = intTemp;
            intPass++;
        }
        displayNumbers(arrNums, strMessage, intSteps, intPasses);

    }

    public static void displayNumbers(int[] intNumbers, String strDisplay, int intSteps, int intPass) {
        for (int intNumber : intNumbers) {
            strDisplay += intNumber + "\n";
        }
        strDisplay += "\nSteps: " + intSteps;
        strDisplay += "\nPasses: " + intPass;
        JOptionPane.showMessageDialog(null, strDisplay);
    }
}
