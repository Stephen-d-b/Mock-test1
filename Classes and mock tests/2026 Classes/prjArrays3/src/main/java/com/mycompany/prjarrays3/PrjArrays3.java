/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjarrays3;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjArrays3 {

    public static void main(String[] args) {
        int intLevels = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter number of oxygen readings"));

        int[] arrOxygen = new int[intLevels];

        for (int i = 0; i < arrOxygen.length; i++) {//remove = 
            arrOxygen[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Oxygen level " + (i + 1)));
        }

        double dblTotal = 0;
        int intLowest = arrOxygen[0];

        for (int i = 0; i < arrOxygen.length; i++) {
            dblTotal = dblTotal + arrOxygen[i];
            if (arrOxygen[i] < intLowest) {
                intLowest = arrOxygen[i];
            }
        }
        DecimalFormat df = new DecimalFormat();
        
        df.applyPattern("#.0#");

        double dblAverage = dblTotal / arrOxygen.length;//devision error

        JOptionPane.showMessageDialog(null, "TOTAL OXYGEN: " + dblTotal + "\nLOWEST LEVEL: " + intLowest + "\nAVERAGE: " + df.format(dblAverage));

    }
}