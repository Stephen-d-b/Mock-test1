/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjvariables2;

import javax.swing.JOptionPane;


/**
 *
 * @author Stephen D
 */
public class PrjVariables2 {

    public static void main(String[] args) {
        
        String strId = "";
        String strName = "";
        String strCourse = "";
        
        strId = JOptionPane.showInputDialog(null, "Please enther your student ID number");
        strName = JOptionPane.showInputDialog(null, "Please enther your student Name");
        strCourse = JOptionPane.showInputDialog(null, "Please enther your student course selection ");
        
        JOptionPane.showMessageDialog(null, "Student ID number: " + strId + 
                                            "\nStudent Name: " +strName + 
                                            "\nStuden Course: " + strCourse);
    }
}
