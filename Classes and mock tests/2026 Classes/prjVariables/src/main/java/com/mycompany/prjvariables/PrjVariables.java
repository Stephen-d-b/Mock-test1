/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjvariables;

/**
 *
 * @author Stephen D
 */
public class PrjVariables {

    public static void main(String[] args) {
        
        String strName = "Stephen";
        int intAge = 20;
        double dblPayRate = 69.67;
        
        strName = "Taylor";
        
        final double dblVat = 0.15; //final means that the variable is constant
        
        System.out.println("PERSONAL DETAIL REPORT");
        System.out.println("---------------------");
        System.out.println("NAME: " + strName);
        System.out.println("AGE: " + intAge);
        System.out.println("PAY RATE: " + dblPayRate);
        System.out.println("---------------------");
        
    }
}
