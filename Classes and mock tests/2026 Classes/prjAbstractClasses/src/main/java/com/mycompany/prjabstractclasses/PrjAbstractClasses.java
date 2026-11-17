/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjabstractclasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjAbstractClasses {

    public static void main(String[] args) {

        String strName = JOptionPane.showInputDialog(null, "Please enter the student name: ");
        
        double dblResult = Double.parseDouble(JOptionPane.showInputDialog(null, "please enter the result of the student to increas: "));
        
        //Student stud = new Student(); // cannot create an object of class student
        //can't create an object from an abstract class 
        //can only create an object from a child class
        
        StudentResults sr = new StudentResults();//chld, subclass, concrete class
        sr.setName(strName);
        sr.setResult(dblResult);
        
        JOptionPane.showMessageDialog(null, "STUDENT NAME: " +  sr.getName() + "\n" + 
                                            "STUDENT RESULTS: " + sr.getResult() + "\n" + 
                                            "STUDENT NEW RESULT: " + sr.getNewResult() + "\n" +
                                            "STATUS CHECK: " + sr.getStatus());
        
        
        
        
    }
}
