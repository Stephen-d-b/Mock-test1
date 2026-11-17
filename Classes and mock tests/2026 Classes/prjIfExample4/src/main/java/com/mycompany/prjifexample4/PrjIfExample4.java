/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjifexample4;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjIfExample4 {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Please enter Your Name: ");
        String strSize = JOptionPane.showInputDialog(null, "Please choose a size: Small... Medium... Large: ");
    
        Sundae order = new Sundae(strName, strSize);
        
        order.CalculatePrice();

        JOptionPane.showMessageDialog(null, 
                "Name: " + order.getName() +
                "\nSize: " + order.getSize() +
                "\nYour Price is: " + order.getFinalPrice());
    }
}
