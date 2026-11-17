/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance2;

/**
 *
 * @author Stephen D
 */
public class OvertimeEmployee extends Employee {
 
    //Fields for overtime work
    
    private int intOvertimeHours;
    private double dblOvertimeRate;
    
    public OvertimeEmployee(String strName, double dblBaseSalary, int intOvertimeHours, double dblOvertimeRate)
    {
        super(strName, dblBaseSalary); // call parent constructor
        this.intOvertimeHours = intOvertimeHours;
        this.dblOvertimeRate = dblOvertimeRate;
        
    }
    
    
    //override the parent version of calculatePay()
    //child provides a more specific rule
    
    
    @Override
    public double calculatePay()
    {
        return super.calculatePay() + (intOvertimeHours * dblOvertimeRate);
    }
    
}
