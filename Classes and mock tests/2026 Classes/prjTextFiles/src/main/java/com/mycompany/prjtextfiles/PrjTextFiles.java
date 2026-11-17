/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjtextfiles;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjTextFiles {

    public static void main(String[] args) {

        try
        {
            String strName = JOptionPane.showInputDialog(null, "Please enter the contact name: ");
            
            String strNumber = JOptionPane.showInputDialog(null, "Please enter contact number: ");
            
           int intConfirm = JOptionPane.showConfirmDialog(null, "Do you want to save", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

           if (intConfirm == JOptionPane.YES_OPTION)
           {
               File saveFile = new File("contacts.txt");
               
               if(!saveFile.exists())
               {
                   saveFile.createNewFile();
               }
               
               FileWriter fw = new FileWriter(saveFile.getAbsoluteFile(), true);
               BufferedWriter bw = new BufferedWriter(fw);
               
               bw.write(strName);
               bw.newLine();
               bw.write(strNumber);
               bw.newLine();
               bw.close();
               
               JOptionPane.showMessageDialog(null, "Your contact has been saved Successfully");
           }
           else
           {
               JOptionPane.showMessageDialog(null, "Your contact has not been saved");
           }

        }
        
        catch(IOException io)
        {
            JOptionPane.showMessageDialog(null, "There was an error save to the text file");
        }
        
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "The following ");
        }
    }
}
