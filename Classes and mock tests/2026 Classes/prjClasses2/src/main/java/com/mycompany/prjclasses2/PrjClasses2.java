/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses2;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjClasses2 {
    
    private static Student s = new Student();

    public static void main(String[] args) {
        
        String strName = JOptionPane.showInputDialog(null,"Please enter your Name: ");
        String strCourse = JOptionPane.showInputDialog(null,"Please enter your Course: ");
        double dblAverage = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter your overall average: "));
        
        s.setName(strName);
        s.setCourse(strCourse);
        s.setAverage(dblAverage);
        
        print();
        
    }
    public static void print()
    {
        String strDisplay = "STUDENT REPORTS: \n" + "STUDENTS: " + s.getName() + "\n" + "COURSE: " + s.getCourse() + "\n" +
                            "AVERAGE: " + s.getAverage() + "%";
        
        JOptionPane.showMessageDialog(null, strDisplay);
    }        
}
