/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjclasses6;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjClasses6 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the docotrs name: ");
        String strDoctor = scan.nextLine();
        
        System.out.println("Please enter the patient name: ");
        String strPatient = scan.nextLine();
        
        System.out.println("Please enter the consultation fee: ");
        double dblFee = scan.nextDouble();
        
        System.out.println("Please enter the number of consultations: ");
        int intConsultations = scan.nextInt();
        
        Doctor d = new Doctor (strDoctor, strPatient, dblFee, intConsultations);
        
        printDetails(d);
    }
     public static void printDetails(Doctor d) {
         System.out.println ( "Docotr Name: " + d.getDoctor() + 
                            "\nThe patients name: " + d.getPatient() + 
                            "\nAccount Balance is: " + d.getTotalDue());
        
    }
}
