/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjdecimalformat;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Stephen D
 */
public class PrjDecimalFormat {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        
        df.applyPattern("#.0##");
        
        System.out.println("Please Enter an amount: ");
        double dblAmount = scan.nextDouble();
        
        double dblTotal = dblAmount /3;
        
        System.out.println("The formatted ammount is: " + df.format(dblTotal));
        System.out.println("You are greate thanks for playing! ");
             
    }
}
