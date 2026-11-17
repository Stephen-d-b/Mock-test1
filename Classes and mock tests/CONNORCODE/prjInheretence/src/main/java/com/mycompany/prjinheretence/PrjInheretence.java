/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinheretence;

import javax.swing.JOptionPane;

/**
 *
 * @author conno
 */
public class PrjInheretence {

    public static void main(String[] args) {
        String strChoice = JOptionPane.showInputDialog(null, 
                "Please enter your sporting event: \n " + 
                        "Tennis, Cricket, Golf or Soccer");
        
        SportEvent event = new SportEvent(strChoice);
        
        if (event.getFee() == 0) {
            JOptionPane.showMessageDialog(null, "Your sporting fee cannot be located");
        } else {
            JOptionPane.showMessageDialog(null, "SPORT EVENT: " + strChoice.toUpperCase() + " \n" + "EVENT FEE: R" + event.getFee());
        }
        
    }
}
