/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjtextfiles1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjTextFiles1 {

    public static void main(String[] args) {
        try
        {
            String strChoice = JOptionPane.showInputDialog(null, "Please enter (1) to record the sales " + "or (2) to view the sales");
            
            if(strChoice.equals("1"))
            {
                int intNumber = Integer.parseInt(JOptionPane.showInputDialog(null, "How many sales transactions do you want to enter?"));
                
                File saveFile = new File("sales.txt");
                
                if(!saveFile.exists())
                {
                   saveFile.createNewFile();
                }
                
                FileWriter fw = new FileWriter(saveFile.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                
                
                for (int index = 0; index < intNumber; index++) 
                {
                    String strName = JOptionPane.showInputDialog(null, "Please enter in the sales persons name:");
                    
                    double dblSales = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the sale amount: "));
                    
                    bw.write(strName);
                    bw.newLine();
                    bw.write(" " + dblSales);
                    bw.newLine();
                }
                JOptionPane.showMessageDialog(null, "All the sales transactions have been captured");
                
                bw.close();
            }
            else if (strChoice.equals("2"))
            {
                int intCount = 0;
                
                String strCurrentLine = "";
                String strDisplay = "";
                
                double dblTotal = 0;
                
                BufferedReader br = new BufferedReader(new FileReader("sales.txt"));
                
                while((strCurrentLine = br.readLine()) != null);
                {
                    strDisplay += strCurrentLine + " R";
                    
                    strCurrentLine = br.readLine();
                    strDisplay += strCurrentLine + "\n";
                    
                    dblTotal += Double.parseDouble(strCurrentLine);
                    
                    intCount += 1;
                }
                
                JOptionPane.showMessageDialog(null, strDisplay + "\nTOTAL: R" + "\nAVERAGE: " + (dblTotal / intCount) + "\nCOUNT " + intCount);
                
                
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
