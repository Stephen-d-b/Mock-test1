/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjclasses7;

/**
 *
 * @author Stephen D
 */
public class Calculations {

    private double dblNum1;
    private double dblNum2;

    public Calculations (double dblNumber1, double dblNumber2) 
    {
        dblNum1 = dblNumber1;
        dblNum2 = dblNumber2;
    }
    
     public double getSum()
     {
         return (dblNum1 + dblNum2);
     }
     
     public double getSubtract()
     {
         return (dblNum1 - dblNum2);
     }
     
     public double getMultiply()
     {
         return (dblNum1 * dblNum2);
     }
     
     public double getDivide()
     {
         return (dblNum1 / dblNum2);
     }
}
