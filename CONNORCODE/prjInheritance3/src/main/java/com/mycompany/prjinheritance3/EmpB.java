/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance3;

/**
 *
 * @author emeris
 */
public class EmpB extends Person {
    private double dblSalary;
    public EmpB(int intID, String strName, double dblSalary) {
        super(intID, strName);
        this.dblSalary = dblSalary;      
    }
    
    public double getSalary() {
        return dblSalary;
    }
    
    public double getMonthlySalary() {
        return dblSalary / 12;
    }
    
    @Override
    public String display() {
        return getID() + " " + getName() + " " + dblSalary + " Monthly Rate: " + getMonthlySalary() ;
    }
    
}
