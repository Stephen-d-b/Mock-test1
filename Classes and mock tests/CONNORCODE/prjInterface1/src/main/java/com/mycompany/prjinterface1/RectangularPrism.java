/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prjinterface1;

/**
 *
 * @author conno
 */
public class RectangularPrism implements Shape {

    private double dblWidth, dblLength, dblHeight;

    public RectangularPrism(double dblWidth, double dblLength, double dblHeight)
    {
        this.dblHeight = dblHeight;
        this.dblLength = dblLength;
        this.dblWidth = dblWidth;
    }
    
    @Override
    public double getArea() {
        return dblHeight * dblLength * dblWidth;
    }
}
