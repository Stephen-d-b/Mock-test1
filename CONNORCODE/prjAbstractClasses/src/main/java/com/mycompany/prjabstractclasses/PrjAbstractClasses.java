/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstractclasses;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjAbstractClasses {

    public static void main(String[] args) {
        String strName = JOptionPane.showInputDialog(null, "Please enter the student name: ");
        double dblResult = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the result of the student to increase: "));
        
        //Student stud = new Student(); //cannot do this
        
        StudentResult sr = new StudentResult();
        
        sr.setName(strName);
        sr.setResult(dblResult);
        
        JOptionPane.showMessageDialog(null, "STUDENT NAME: " + sr.getName() + "\n"
                + "STUDENT RESULT: " + sr.getResult() + "\n"
                        + "STUDENT NEW RESULT: " + sr.getNewResult() + "\n"
                                + "STUDENT CHECK: " +sr.getStatut());
        
        //Above we used and called the StudentResult (Child class) - not the abstract class
    }
}
