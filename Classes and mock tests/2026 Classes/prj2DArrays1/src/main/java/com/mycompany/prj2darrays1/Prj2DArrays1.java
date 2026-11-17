/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2darrays1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class Prj2DArrays1 {

    public static void main(String[] args) {
        String[][] array ={ {"City", "Highest Temp(C)", "Lowest Temp(C)"},
                          {"Cape Town", "35", "8"},
                          {"Johannesburg", "37", "5"},
                          {"Pretoria", "37", "6"},
                          {"Bloemfontein", "38", "3"},
                          {"Port Elizabeth", "33", "10"},
                          {"Durban", "35", "12"},};
        
        String display = "";
        
        for (int row = 0; row < 7; row++) 
        {
            for (int col = 0; col < 3; col++) 
            {
                display += String.format("%-35s", array[row][col]);
            }
            display += "\n";
            
            if (row == 0) {
            display += "----------------------------------------------------------------------------------------\n";
        }
        }
        
        
        //StackOverFlow (2015)
        
        
        
//        System.out.println(display);

        JOptionPane.showMessageDialog(null, display);
    }
}
