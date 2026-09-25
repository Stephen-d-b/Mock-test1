/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface2;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjInterface2 {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Enter name:");
        String strCourse = JOptionPane.showInputDialog(null, "Enter Course:");
        double dblFees = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter monthly fees: "));
        
        StudentFees newFees = new StudentFees(dblFees, strName, strCourse);
        
        JOptionPane.showMessageDialog(null, newFees.fullTime());
        JOptionPane.showMessageDialog(null, newFees.partTime());
    }
}
