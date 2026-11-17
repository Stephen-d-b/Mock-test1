/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prjinterface1;

import javax.swing.JOptionPane;

/**
 *
 * @author Stephen D
 */
public class PrjInterface1 {

    public static void main(String[] args) {

        Circle circ = new Circle(3);
        
        Rectangle rec = new Rectangle(5, 10);
        
        Triangle tri = new Triangle(6, 13);
        
        JOptionPane.showInputDialog(null, "Circle Area: " + circ.getArea());
        JOptionPane.showInputDialog(null, "Rectangle area: " + rec.getArea());
        JOptionPane.showInputDialog(null, "Triangle area: " + tri.getArea());
        
        

    }
}
