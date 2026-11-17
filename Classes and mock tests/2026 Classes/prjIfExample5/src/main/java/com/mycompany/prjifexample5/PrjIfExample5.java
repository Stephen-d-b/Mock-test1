/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample5;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjIfExample5 {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Please enter Your Name: ");
        String strWoodType = JOptionPane.showInputDialog(null, "Please choose a wood Type Oak or Pine: ");
        int intChar = Integer.parseInt (JOptionPane.showInputDialog(null, "Please choose the total Characters: "));
        String strCharColour = JOptionPane.showInputDialog(null, "Please choose a Font Colour White, Black Or Gold: ");
    
        Sign s = new Sign(strName, strWoodType, strCharColour, intChar);
        
        s.CalculatePrice();
        s.CalculatePrice2();
        s.CalculatePrice3();

        JOptionPane.showMessageDialog(null, 
                "Name: " + s.getName() +
                "\nWoodType: " + s.getWoodType() +
                "\nFontColor: " + s.getCharColour() +
                "\nTotal Characters: " + s.getintChar() +
                "\nYour Price is: R" + s.getFinalPrice());
    }
}
