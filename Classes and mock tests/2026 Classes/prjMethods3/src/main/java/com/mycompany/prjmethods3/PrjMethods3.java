/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjmethods3;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjMethods3 {

    public static void main(String[] args) {
        String strId = "";
        String strName = "";
        String strBirth = "";
        String strPhoneNumber = "";
        

        
        strId = JOptionPane.showInputDialog(null, "Please enther your ID number");
        strName = JOptionPane.showInputDialog(null, "Please enther your Name");
        strBirth = JOptionPane.showInputDialog(null, "Please enther your Date of Birth");
        strPhoneNumber = JOptionPane.showInputDialog(null, "Please enther your Phone Number");
        
        printDetails(strId,strName,strBirth,strPhoneNumber); 
        exitApplication();
    }
    
    
    
    private static void printDetails(String strId,String strName,String strBirth,String strPhoneNumber)
    {
        JOptionPane.showMessageDialog(null,"Your Name is: " + strName + 
                                            "\nID Number: " + strId + 
                                            "\nDate of birth: " + strBirth +
                                            "\nPhone Number: " + strPhoneNumber);
    }
    
    private static void exitApplication(){
        JOptionPane.showMessageDialog(null, "Thanks for playing You lost the game");
    }
}
