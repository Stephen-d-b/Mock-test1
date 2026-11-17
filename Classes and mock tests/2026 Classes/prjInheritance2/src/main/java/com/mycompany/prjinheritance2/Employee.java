/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance2;

/**
 *
 * @author Stephen D
 */
public class Employee {
    
    private String strName;
    private double dblBaseSalary;
    
    public Employee(String strName, double dblBaseSalary)
    {
        this.strName = strName;
        this.dblBaseSalary = dblBaseSalary;
    }
    
    public String getName()
    {
        return strName;
    }
    
    //method to calculate pay
    //defualt action just returning the base salary
    
    public double calculatePay()
    {
        return dblBaseSalary;
    }
    
    
    //subclasses can override this method
}
