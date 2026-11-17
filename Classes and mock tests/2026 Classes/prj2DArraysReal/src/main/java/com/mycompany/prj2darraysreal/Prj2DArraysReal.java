/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prj2darraysreal;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class Prj2DArraysReal {

public static void main(String[] args) {
        String[][] array ={
                          {"Cape Town", "35", "8"},
                          {"Johannesburg", "37", "5"},
                          {"Pretoria", "37", "6"},
                          {"Bloemfontein", "38", "3"},
                          {"Port Elizabeth", "33", "10"},
                          {"Durban", "35", "12"},};
        
        display(array);
          
    }

    private static void display(String[][] array) {
        
        String display = "";
        
        for (int index = 0; index < array.length; index++) 
        {
            display += "City: " + array[index][0] + "\n" + "Highest: " + array[index][1] + "\n" + "Lowest: " + array[index][2] + "\n\n";
        }
        
        JOptionPane.showMessageDialog(null, display);
    }
}
