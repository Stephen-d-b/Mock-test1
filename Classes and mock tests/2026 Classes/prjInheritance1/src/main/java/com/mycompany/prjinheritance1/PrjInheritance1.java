/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheritance1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjInheritance1 {

    public static void main(String[] args) {
        String strChoice = JOptionPane.showInputDialog(null, "please enter your Event: \n"
                + "Tennis, Cricket, Golf or Soccer");
        
        SportEvent event= new SportEvent(strChoice);
        
        if(event.getFee() == 0 )
        {
            JOptionPane.showMessageDialog(null, "Your Sporting Event cannot be located");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "SPORT EVENT: " + strChoice.toUpperCase() + "\n" + "EVENT FEE: "
                                          + event.getFee()) ;
        }
    }
}
