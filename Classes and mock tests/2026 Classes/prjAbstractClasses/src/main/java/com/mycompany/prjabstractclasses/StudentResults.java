/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjabstractclasses;

/**
 *
 * @author Stephen D
 */
public class StudentResults extends Student {
    
    //child, subclass, concrete class
    
    private String strName;
    private double dblResult;
    
    // implemetation of the abstract methods
    
    @Override
    public void setName(String strName)
    {
        this.strName = strName;
    }
    
    @Override
    public void setResult(double dblResult)
    {
        this.dblResult = dblResult;
    }
    
    @Override
    public String getName()
    {
        return strName;
    }
    
    @Override
    public double getResult()
    {
        return this.dblResult;
    }
    
    // Normal method, created in the child /concrete class
    
    public double getNewResult()
    {
        return dblResult += dblResult * 0.15; // += means accumilate
    }
    
    
    
}
