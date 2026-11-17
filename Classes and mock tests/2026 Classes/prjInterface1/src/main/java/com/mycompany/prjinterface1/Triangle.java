/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface1;

/**
 *
 * @author Stephen D
 */
public class Triangle implements Shape{
    
    private double dblBase, dblHeight;
    
    public Triangle (double dblBase, double dblHeight)
    {
        this.dblHeight = dblHeight;
        this.dblBase = dblBase;
    }
    
    @Override
    public double getArea()
    {
        return 0.5 * dblBase * dblHeight;
    }
    
    
}
