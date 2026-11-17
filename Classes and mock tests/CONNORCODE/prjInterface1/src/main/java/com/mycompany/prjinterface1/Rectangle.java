/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface1;

/**
 *
 * @author conno
 */
public class Rectangle implements Shape {
    private double dblWidth, dblHeight;
    
    public Rectangle(double dblWidth, double dblHeight) {
        this.dblHeight = dblHeight;
        this.dblWidth = dblWidth;
    }
    
    @Override
    public double getArea() {
        return dblHeight * dblWidth;
    }
}
