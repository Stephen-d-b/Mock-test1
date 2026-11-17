/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance3;

/**
 *
 * @author emeris
 */
public class EmpA extends Person {
    private double dblSalary;
    public EmpA(int intID, String strName, double dblSalary) {
        super(intID, strName);
        this.dblSalary = dblSalary;      
    }
    
    public double getSalary() {
        return dblSalary;
    }
    
    @Override
    public String display() {
        return getID() + " " + getName() + " " + dblSalary;
    }
    
}
