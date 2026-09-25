/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface1;

/**
 *
 * @author conno
 */
public class Circle implements Shape {
    private double dblRadius;
    private double dblDiameter;
    
    public Circle(double dblRadius) {
        this.dblRadius = dblRadius;
    }
 
    
    @Override
    public double getArea() {
        return (Math.round(Math.PI * Math.pow(dblRadius, 2) * 100.0)) / 100.0;
        
        // (Math.round() * 100.0)/ 100.0
    }
    
    
    
}
