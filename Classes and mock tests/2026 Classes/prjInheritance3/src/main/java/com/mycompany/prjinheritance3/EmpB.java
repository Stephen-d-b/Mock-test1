/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinheritance3;

/**
 *
 * @author Stephen D
 */
public class EmpB extends Person{
 
     private double dblSalary;
    
    public EmpB(int intId, String strName, double dblSalary)
    {
        super(intId, strName);
        this.dblSalary = dblSalary;
    }
    
    public double getSalary()
    {
        return dblSalary;
    }
    
    @Override
    public String display()
    {
        return getId() + " " + getName() + " " + dblSalary;
    }
    
    //Final or private methods cannot be overriden
    
    /*    
    @Override
    public String dontChangeMe()
    {
        return getId() + " " + getName() + " " + dblSalary;
    }
    */
    
}
