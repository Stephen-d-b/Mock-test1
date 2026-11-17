/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjifexample3;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjIfExample3 {

    public static void main(String[] args) {
        String strEmpName = JOptionPane.showInputDialog(null, "Please enter Your Name: ");
        String strHome = JOptionPane.showInputDialog(null, "Please state which village you live in: ").toLowerCase();

        Carpool car = new Carpool(strHome);

        String strMessage = car.checkCarpool();
    }
}