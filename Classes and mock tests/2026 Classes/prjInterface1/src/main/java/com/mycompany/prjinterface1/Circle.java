/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface1;

/**
 *
 * @author Stephen D
 */
public class Circle implements Shape {
 
    private double dblRadius;
    
    public Circle(double dblRadius)
    {
        this.dblRadius = dblRadius;
    }
    
    @Override
    public double getArea()
    {
        return 3.141592654 * (dblRadius * dblRadius);
    }
    
}
