/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjforloops3;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjForLoops3 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        //input 3 student numbers
        for(int intIndex = 1; intIndex <= 5; intIndex++)
        {
            String strBook = JOptionPane.showInputDialog(null, "Please enter Book name ");
            
            Book b = new Book(strBook);
            
            JOptionPane.showMessageDialog(null,"Book # " + intIndex + " " + b.getstrBook());
        }
        
    }
}
