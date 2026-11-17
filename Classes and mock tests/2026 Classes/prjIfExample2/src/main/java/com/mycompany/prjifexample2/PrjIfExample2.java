/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prjifexample2;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjIfExample2 {

    public static void main(String[] args) {
        int intTest1, intTest2;
        double dblAvg = 0.0;
        final int intPassed = 60;

        intTest1 = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter you first test score: "));
        intTest2 = Integer.parseInt(JOptionPane.showInputDialog(null, "please enter you second test score: "));

        Student s = new Student(intTest1, intTest2);

        dblAvg = s.getAvg();
        
        if (s.isPassed (intPassed) == true) {
            JOptionPane.showMessageDialog(null, "You average is: " + dblAvg + " you passed");
        } else {
            JOptionPane.showMessageDialog(null, "You average is: " + dblAvg + " you Failed");
        }
        
    }
    
}
