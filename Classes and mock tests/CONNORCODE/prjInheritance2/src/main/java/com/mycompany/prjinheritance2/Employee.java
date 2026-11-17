/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance2;

/**
 *
 * @author emeris
 */
public class Employee {
    //parent
    
    private String strName;
    private double dblBaseSalary;
    
    public Employee(String strName, double dblBaseSalary){
        this.strName = strName;
        this.dblBaseSalary = dblBaseSalary;
    }
    
    public String getName() {
        return strName;
    }
    
    // method to calcuate pay
    // defualt action: just return base salary
    
    public double calculatePay() {
        return dblBaseSalary;
    }
    
    //subclasses can override this method to provide their own rule/version
}
