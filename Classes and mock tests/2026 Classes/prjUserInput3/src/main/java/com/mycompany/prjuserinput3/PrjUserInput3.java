/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjuserinput3;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjUserInput3 {

    public static void main(String[] args) {
       
        String strName = JOptionPane.showInputDialog(null,"PLease enter your Name");
        
        int intSubjects = Integer.parseInt(JOptionPane.showInputDialog(null,"How many subjects are you taking?"));
        double dblCostPerSubject = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter cost per subjects" ));
        
        double dblTotal = intSubjects * dblCostPerSubject;
        
        JOptionPane.showMessageDialog(null, "Your Name is: " + strName + 
                                    "\nTotal Subjects: " + intSubjects +
                                    "\nCost per subjet: " + dblCostPerSubject +
                                    "\nTotal cost for all your subjects: " + dblTotal);
    }
}
