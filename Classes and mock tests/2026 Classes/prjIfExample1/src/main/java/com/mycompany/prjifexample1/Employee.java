/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjifexample1;

/**
 *
 * @author Stephen D
 */
public class Employee {
    
    private String strIdNumber;
    private int intNumSold;
    
    public Employee(String strIdNumber, int intNumSold)
    {
        this.strIdNumber = strIdNumber;
        this.intNumSold = intNumSold;
    }
    
    public boolean isHighPerformer(int intHigh)
    {
        return intNumSold > intHigh; 
    }
    
}
